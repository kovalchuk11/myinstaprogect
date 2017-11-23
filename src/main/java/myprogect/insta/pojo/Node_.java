
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Node_ {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("created_at")
    @Expose
    private long createdAt;
    @SerializedName("owner")
    @Expose
    private Owner owner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }



}
