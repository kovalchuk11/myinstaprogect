package myprogect.insta.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "infoacc")
public class Infoacc implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Column(name = "accids")
    private long accid;
    @NotNull
    @Column(name = "fullnames")
    private String fullname;
    @NotNull
    @Column(name = "usernames")
    private String username;
    @NotNull
    @Column(name = "followerss")
    private long followers;
    @NotNull
    @Column(name = "likes")
    private long like;
    @NotNull
    @Column(name = "comments")
    private long comment;
    @NotNull
    @Column(name = "views")
    private long view;
    @NotNull
    @Column(name = "imgs")
    private String img;
    @NotNull
    @Column(name = "urls")
    private String urls;

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

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

    @Override
    public String toString() {
        return "Infoacc{" +
                "id=" + id +
                ", accid=" + accid +
                ", fullname='" + fullname + '\'' +
                ", username='" + username + '\'' +
                ", followers=" + followers +
                ", like=" + like +
                ", comment=" + comment +
                ", view=" + view +
                ", img='" + img + '\'' +
                '}';
    }

}