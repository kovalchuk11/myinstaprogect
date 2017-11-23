
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Node {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("comments_disabled")
    @Expose
    private boolean commentsDisabled;
    @SerializedName("dimensions")
    @Expose
    private Dimensions dimensions;
    @SerializedName("gating_info")
    @Expose
    private Object gatingInfo;
    @SerializedName("media_preview")
    @Expose
    private String mediaPreview;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("thumbnail_src")
    @Expose
    private String thumbnailSrc;
    @SerializedName("thumbnail_resources")
    @Expose
    private List<ThumbnailResource> thumbnailResources = new ArrayList<ThumbnailResource>();
    @SerializedName("is_video")
    @Expose
    private boolean isVideo;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("date")
    @Expose
    private long date;
    @SerializedName("display_src")
    @Expose
    private String displaySrc;
    @SerializedName("video_views")
    @Expose
    private long videoViews;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("comments")
    @Expose
    private Comments comments;
    @SerializedName("likes")
    @Expose
    private Likes likes;
	@SerializedName("text")
    @Expose
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isCommentsDisabled() {
        return commentsDisabled;
    }

    public void setCommentsDisabled(boolean commentsDisabled) {
        this.commentsDisabled = commentsDisabled;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Object getGatingInfo() {
        return gatingInfo;
    }

    public void setGatingInfo(Object gatingInfo) {
        this.gatingInfo = gatingInfo;
    }

    public String getMediaPreview() {
        return mediaPreview;
    }

    public void setMediaPreview(String mediaPreview) {
        this.mediaPreview = mediaPreview;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getThumbnailSrc() {
        return thumbnailSrc;
    }

    public void setThumbnailSrc(String thumbnailSrc) {
        this.thumbnailSrc = thumbnailSrc;
    }

    public List<ThumbnailResource> getThumbnailResources() {
        return thumbnailResources;
    }

    public void setThumbnailResources(List<ThumbnailResource> thumbnailResources) {
        this.thumbnailResources = thumbnailResources;
    }

    public boolean isIsVideo() {
        return isVideo;
    }

    public void setIsVideo(boolean isVideo) {
        this.isVideo = isVideo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getDisplaySrc() {
        return displaySrc;
    }

    public void setDisplaySrc(String displaySrc) {
        this.displaySrc = displaySrc;
    }

    public long getVideoViews() {
        return videoViews;
    }

    public void setVideoViews(long videoViews) {
        this.videoViews = videoViews;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }


}
