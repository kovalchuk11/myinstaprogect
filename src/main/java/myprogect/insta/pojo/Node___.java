
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Node___ {

    @SerializedName("__typename")
    @Expose
    private String typename;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("shortcode")
    @Expose
    private String shortcode;
    @SerializedName("dimensions")
    @Expose
    private Dimensions_ dimensions;
    @SerializedName("gating_info")
    @Expose
    private Object gatingInfo;
    @SerializedName("media_preview")
    @Expose
    private String mediaPreview;
    @SerializedName("display_url")
    @Expose
    private String displayUrl;
    @SerializedName("display_resources")
    @Expose
    private List<DisplayResource_> displayResources = new ArrayList<DisplayResource_>();
    @SerializedName("is_video")
    @Expose
    private boolean isVideo;
    @SerializedName("should_log_client_event")
    @Expose
    private boolean shouldLogClientEvent;
    @SerializedName("tracking_token")
    @Expose
    private String trackingToken;
    @SerializedName("edge_media_to_tagged_user")
    @Expose
    private EdgeMediaToTaggedUser_ edgeMediaToTaggedUser;
    @SerializedName("dash_info")
    @Expose
    private DashInfo dashInfo;
    @SerializedName("video_url")
    @Expose
    private String videoUrl;
    @SerializedName("video_view_count")
    @Expose
    private long videoViewCount;

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

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public Dimensions_ getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions_ dimensions) {
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

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public List<DisplayResource_> getDisplayResources() {
        return displayResources;
    }

    public void setDisplayResources(List<DisplayResource_> displayResources) {
        this.displayResources = displayResources;
    }

    public boolean isIsVideo() {
        return isVideo;
    }

    public void setIsVideo(boolean isVideo) {
        this.isVideo = isVideo;
    }

    public boolean isShouldLogClientEvent() {
        return shouldLogClientEvent;
    }

    public void setShouldLogClientEvent(boolean shouldLogClientEvent) {
        this.shouldLogClientEvent = shouldLogClientEvent;
    }

    public String getTrackingToken() {
        return trackingToken;
    }

    public void setTrackingToken(String trackingToken) {
        this.trackingToken = trackingToken;
    }

    public EdgeMediaToTaggedUser_ getEdgeMediaToTaggedUser() {
        return edgeMediaToTaggedUser;
    }

    public void setEdgeMediaToTaggedUser(EdgeMediaToTaggedUser_ edgeMediaToTaggedUser) {
        this.edgeMediaToTaggedUser = edgeMediaToTaggedUser;
    }

    public DashInfo getDashInfo() {
        return dashInfo;
    }

    public void setDashInfo(DashInfo dashInfo) {
        this.dashInfo = dashInfo;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public long getVideoViewCount() {
        return videoViewCount;
    }

    public void setVideoViewCount(long videoViewCount) {
        this.videoViewCount = videoViewCount;
    }
}
