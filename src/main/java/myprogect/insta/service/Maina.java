package myprogect.insta.service;

import me.postaddict.instagram.scraper.AuthenticatedInsta;
import me.postaddict.instagram.scraper.Instagram;
import me.postaddict.instagram.scraper.cookie.CookieHashSet;
import me.postaddict.instagram.scraper.cookie.DefaultCookieJar;
import me.postaddict.instagram.scraper.domain.Account;
import me.postaddict.instagram.scraper.exception.InstagramNotFoundException;
import me.postaddict.instagram.scraper.interceptor.ErrorInterceptor;
import me.postaddict.instagram.scraper.interceptor.UserAgentInterceptor;
import me.postaddict.instagram.scraper.interceptor.UserAgents;
import myprogect.insta.model.Averagedata;
import myprogect.insta.service.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

@Service
public class Maina {

    private static AuthenticatedInsta client;
    private static int c = 17;
//    private static Set<String> followers = new HashSet<>();


    public static void start() throws IOException {

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
        else c = 17;
        System.out.println(c);
    }
    public String urlToUsername(String url){
        String[] username1 = url.split("/");
        String username = username1[username1.length - 1];
        return username;
    }

    public String testFollowers(String first, String second) throws Exception {
        if(first.equals("")||second.equals("")){
            return "заполните поля";
        }

        ArrayList<String> followers = new ArrayList<>();
        String username = null;
        String username1 = urlToUsername(first);
        String username2 = urlToUsername(second);
        int one;
        int two;
        try {
        if (client.getAccountByUsername(username1).isPrivate || client.getAccountByUsername(username2).isPrivate)
            return "Один из аккаунтов приватный";
        } catch (InstagramNotFoundException t) {
            return null;
        }
        try {
            one = client.getAccountByUsername(username1).followedByCount;
            two = client.getAccountByUsername(username2).followedByCount;
        } catch (InstagramNotFoundException t) {
            return "Одного из аккаунтов не существует";
        }

        if ((one | two) >= 5000)
            return "У одного из них больше 5к подписчиков";
        for (int i = 0; i < 2; i++) {
            if (i == 0)
                username = username1;
            else if (i == 1)
                username = username2;
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
        return "Уникальных подписчиков " + x + "%" + "\r\n сходство на " + (100 - x) + "%";
    }


    public String getFollowers(String first) throws Exception {

        String username = null;
        String username1 = urlToUsername(first);
        int one;
        try {
        if (client.getAccountByUsername(username1).isPrivate)
            return "Это прватный аккаунт, невозможно спарсить подписчиков";
            one = client.getAccountByUsername(username1).followedByCount;
        } catch (InstagramNotFoundException t) {
            return "Aккаунт не существует";
        }

        if (one >= 5000)
            return "У аккаунта больше 5к подписчиков";
        username = username1;
        Account account = client.getAccountByUsername(username);
        List<Account> followerss = client.getFollowers(account.id, account.followedByCount);
        StringBuffer folowers = new StringBuffer();
        for (Account a : followerss) {
            folowers.append(a.username + "\r\n");
        }
        followerss.clear();
        System.out.print(folowers.toString());
        return folowers.toString();
    }

    public String getAvarage(Averagedata averagedata){
        Anonymus anonymus = new Anonymus();
        String check = anonymus.checkUser(averagedata);
        String message ="";
        if(check.equals("Аккаунт открыт")){
//            System.out.println(anonymus.selectionPosts(averagedata));
            message = anonymus.selectionPosts(averagedata);
        }
        return message;
    }
}
