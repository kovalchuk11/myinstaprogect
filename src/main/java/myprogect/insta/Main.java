package myprogect.insta;

import me.postaddict.instagram.scraper.AuthenticatedInsta;
import me.postaddict.instagram.scraper.Instagram;
import me.postaddict.instagram.scraper.cookie.CookieHashSet;
import me.postaddict.instagram.scraper.cookie.DefaultCookieJar;
import me.postaddict.instagram.scraper.domain.Account;
import me.postaddict.instagram.scraper.interceptor.ErrorInterceptor;
import me.postaddict.instagram.scraper.interceptor.UserAgentInterceptor;
import me.postaddict.instagram.scraper.interceptor.UserAgents;
import myprogect.insta.service.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

@Service
public class Main {

    private static AuthenticatedInsta client;
    private static int c = 17;
    private static Set<String> followers = new HashSet<>();


    public static synchronized void start() throws IOException {

        Credentials credentials = new Credentials(c);
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(loggingInterceptor)
                .addInterceptor(new UserAgentInterceptor(UserAgents.OSX_CHROME))
                .addInterceptor(new ErrorInterceptor())
                .cookieJar(new DefaultCookieJar(new CookieHashSet()))
                .build();
        client = new Instagram(httpClient);
        client.basePage();
        client.login(credentials.getLogin(), credentials.getPassword());
        client.basePage();
        if (c <= 21)
            c++;
        else c = 1;
        System.out.println(c);
    }

    public static synchronized String testFollowers(String first, String second) throws Exception {
        String username = null;
        String[] username1 = first.split("/");
        String[] username2 = second.split("/");
        int one = client.getAccountByUsername(username1[username1.length - 1]).followedByCount;
        int two = client.getAccountByUsername(username2[username2.length - 1]).followedByCount;
        if ((one | two) <= 5000) {
            for (int i = 0; i < 2; i++) {
                if (i == 0)
                    username = username1[username1.length - 1];
                else if (i == 1)
                    username = username2[username2.length - 1];
                Account account = client.getAccountByUsername(username);
                List<Account> followerss = client.getFollowers(account.id, account.followedByCount);
                for (Account a : followerss)
                    if (followers.contains(a.username))
                        followers.remove(a.username);
                    else
                        followers.add(a.username);


            }
            int x = followers.size() * 100 / (one + two);
            followers.clear();
            return "уникальных подписчиков " + x + "%" + "|| сходство на " + (100 - x) + "%";
        } else
            return "У одного из них больше 5к подписоты";
    }
}
