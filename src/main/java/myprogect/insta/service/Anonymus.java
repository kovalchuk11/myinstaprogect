package myprogect.insta.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import myprogect.insta.entity.Infoacc;
import myprogect.insta.pojo.Jsona;
import myprogect.insta.model.Averagedata;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
* Перед сбором данных запустить метод checkUser
*
* */

public class Anonymus {
    String endCursor = "";
    String codvideo = "";
    long id = 0;
    long like = 0;
    long view = 0;
    long comments = 0;
    int counpost = 0;
    int countvideo = 0;
    String fullname = "";
    String usernames = "";
    long followers = 0;
    String img = "";


    static OkHttpClient client = new OkHttpClient();


    public String urlToUsername(String url) {
        String[] username1 = url.split("/");
        String username = username1[username1.length - 1];
        return username;
    }

    public String checkUser(Averagedata averagedata) {
        String username = urlToUsername(averagedata.getUrl());
//        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(Endpoint.getAccountJsonInfo(username))
                .build();
        Response responses = null;
        try {
            responses = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int code = responses.code();
        if (code == 200) {
            String jsonInfo = null;
            try {
                jsonInfo = responses.body().string();
            } catch (IOException e) {
                e.printStackTrace();
                responses.close();
            }
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            Jsona userinfo = gson.fromJson(jsonInfo, Jsona.class);
            boolean isPrivate = userinfo.getUser().isIsPrivate();
            if (isPrivate) {
                System.out.println("Аккаунт закрыт");
                return "Аккаунт закрыт";
            }
            if (!isPrivate) {
                System.out.println("Аккаунт открыт");
                return "Аккаунт открыт";
            }

        } else if (code == 404) {
            System.out.println("Аккаунт не найден");
            return "Аккаунт не найден";
        } else {
            System.out.println("Попробуйте позже, не хватает ресурсов для запросов");
            return "Попробуйте позже, не хватает ресурсов для запросов";
        }
        return "Что то пошло не так";
    }

    public void checkDate(Averagedata averagedata) {
        String ot = averagedata.getOt();
        String po = averagedata.getPo();

        if ((averagedata.getOt().equals("") & averagedata.getPo().equals("")) || (!averagedata.getOt().equals("") & !averagedata.getPo().equals(""))) {
            System.out.println("true");
            if (averagedata.getOt().equals("") & averagedata.getPo().equals("")) {
                //** allposts
            } else {
                selectionPosts(averagedata);
            }
        } else {
            System.out.println("даты не верные");
            return;
        }

    }

    public String getJson(String usetname, String endCursor) {
//        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(Endpoint.getAccountMedias(usetname, endCursor))
                .build();
        Response responses = null;
        try {
            responses = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int code = responses.code();
        String jsonInfo = new String();
        if (code == 200) {
            try {
                jsonInfo = responses.body().string();
            } catch (IOException e) {
                e.printStackTrace();
                responses.close();
            }
        }
        return jsonInfo;
    }

    public static String getJsonMedia(String codes) {
//        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(Endpoint.getMediaJsonInfo(codes))
                .build();
        Response responses = null;
        try {
            responses = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int code = responses.code();
        String jsonInfo = new String();

        try {
            jsonInfo = responses.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            responses.close();
        }
        return jsonInfo;
    }

    public String selectionPosts(Averagedata averagedata) {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");
        long dateOt = 0;
        long datePo = 0;
        try {
            dateOt = format.parse(averagedata.getOt()).getTime();
            datePo = format.parse(averagedata.getPo()).getTime() - 86400000;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String username = urlToUsername(averagedata.getUrl());
        String jsonInfo = getJson(username, endCursor);
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Jsona userinfo = gson.fromJson(jsonInfo, Jsona.class);
        int countNode = userinfo.getUser().getMedia().getNodes().size();
        long date = 0;
        for (int i = 0; i < countNode; i++) {
            date = userinfo.getUser().getMedia().getNodes().get(i).getDate() * 1000L - 86400000;

            if ((dateOt >= date) & (date >= datePo)) {
                like += userinfo.getUser().getMedia().getNodes().get(i).getLikes().getCount();
                comments += userinfo.getUser().getMedia().getNodes().get(i).getComments().getCount();
                boolean isvideo = userinfo.getUser().getMedia().getNodes().get(i).isIsVideo();
                counpost++;
                if (isvideo) {
                    codvideo = userinfo.getUser().getMedia().getNodes().get(i).getCode();
                    String jsonMedia = Anonymus.getJsonMedia(codvideo);
                    Jsona postinfo = gson.fromJson(jsonMedia, Jsona.class);
                    view += postinfo.getGraphql().getShortcodeMedia().getVideoViewCount();
                    countvideo++;
                }
                System.out.println(like + "|" + comments + "|" + isvideo + "|" + view);

            }

        }
        if (userinfo.getUser().getMedia().getPageInfo().isHasNextPage()) {
            if (!(date < datePo)) {
                endCursor = userinfo.getUser().getMedia().getPageInfo().getEndCursor();
                selectionPosts(averagedata);
            }
        }

        return getAverage();
    }

    public String getAverage() {
        long like = 0;
        long comment = 0;
        long view = 0;
        int counpost = this.counpost;
        int countvideo = this.countvideo;
        try {
            like = this.like / this.counpost;
            comment = this.comments / this.counpost;
            view = this.view / this.countvideo;
        } catch (ArithmeticException e) {
        }

        String str = "лайков: " + like + " | комментов: " + comment + " | просмотров: " + view + " | к-во всех постов: " + counpost + " | к-во видео: " + countvideo;

        return str;
    }
//    -----------------------------------------
public Infoacc selectionPosts(Averagedata averagedata, Infoacc acc) {
    SimpleDateFormat format = new SimpleDateFormat();
    format.applyPattern("dd.MM.yyyy");
    long dateOt = 0;
    long datePo = 0;
    try {
        dateOt = format.parse(averagedata.getOt()).getTime();
        datePo = format.parse(averagedata.getPo()).getTime() - 86400000;
    } catch (ParseException e) {
        e.printStackTrace();
    }
    String username = urlToUsername(averagedata.getUrl());
    String jsonInfo = getJson(username, endCursor);
    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    Jsona userinfo = gson.fromJson(jsonInfo, Jsona.class);
    int countNode = userinfo.getUser().getMedia().getNodes().size();
    long date = 0;
    for (int i = 0; i < countNode; i++) {
        date = userinfo.getUser().getMedia().getNodes().get(i).getDate() * 1000L - 86400000;

        if ((dateOt >= date) & (date >= datePo)) {
            like += userinfo.getUser().getMedia().getNodes().get(i).getLikes().getCount();
            comments += userinfo.getUser().getMedia().getNodes().get(i).getComments().getCount();
            fullname = userinfo.getUser().getFullName();
            followers = userinfo.getUser().getFollowedBy().getCount();
            img = userinfo.getUser().getProfilePicUrl();
            id = Long.parseLong(userinfo.getUser().getId());
            usernames = userinfo.getUser().getUsername();
            counpost++;

            boolean isvideo = userinfo.getUser().getMedia().getNodes().get(i).isIsVideo();
            if (isvideo) {
                codvideo = userinfo.getUser().getMedia().getNodes().get(i).getCode();
                String jsonMedia = Anonymus.getJsonMedia(codvideo);
                Jsona postinfo = gson.fromJson(jsonMedia, Jsona.class);
                view += postinfo.getGraphql().getShortcodeMedia().getVideoViewCount();
                countvideo++;
            }
            System.out.println(like + "|" + comments + "|" + isvideo + "|" + view);

        }

    }
    if (userinfo.getUser().getMedia().getPageInfo().isHasNextPage()) {
        if (!(date < datePo)) {
            endCursor = userinfo.getUser().getMedia().getPageInfo().getEndCursor();
            selectionPosts(averagedata);
        }
    }

    return getAverage(acc);
}

    public Infoacc getAverage(Infoacc acc) {
        try {
//            acc.setId(2);
            if (!(this.counpost == 0))
            acc.setLike(this.like / this.counpost);
            if (!(this.counpost == 0))
            acc.setComment(this.comments / this.counpost);
            if (!(this.countvideo == 0))
            acc.setView(this.view / this.countvideo);
            acc.setFollowers(this.followers);
            acc.setImg(this.img);
            acc.setFullname(this.fullname);
            acc.setAccid(this.id);
            acc.setUsername(this.usernames);
            System.out.println(acc);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println(acc);
        return acc;
    }

    public static String encodeStringUrl(String url) {
        String encodedUrl = null;
        try {
            encodedUrl = URLEncoder.encode(url, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return encodedUrl;
        }
        return encodedUrl;
    }
    public static String decodeStringUrl(String encodedUrl) {
        String decodedUrl = null;
        try {
            decodedUrl = URLDecoder.decode(encodedUrl, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return decodedUrl;
        }
        return decodedUrl;
    }

}
