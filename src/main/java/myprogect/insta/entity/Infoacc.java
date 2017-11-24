package myprogect.insta.entity;

import javax.persistence.*;

@Entity
public class Infoacc {
    @Id
    @GeneratedValue
    private long id;
    private long accid;
    private String fullname;
    private String username;
    private long followers;
    private long like;
    private long comment;
    private long view;
    private String img;

    public Infoacc() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getAccid() {
        return accid;
    }

    public void setAccid(long accid) {
        this.accid = accid;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public long getFollowers() {
        return followers;
    }

    public void setFollowers(long followers) {
        this.followers = followers;
    }


    public long getLike() {
        return like;
    }

    public void setLike(long like) {
        this.like = like;
    }


    public long getComment() {
        return comment;
    }

    public void setComment(long comment) {
        this.comment = comment;
    }


    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }


    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }



}