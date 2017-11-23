
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ShortcodeMedia {

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
    private Dimensions dimensions;
    @SerializedName("gating_info")
    @Expose
    private Object gatingInfo;
    @SerializedName("media_preview")
    @Expose
    private Object mediaPreview;
    @SerializedName("display_url")
    @Expose
    private String displayUrl;
    @SerializedName("display_resources")
    @Expose
    private List<DisplayResource> displayResources = new ArrayList<DisplayResource>();
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
    private EdgeMediaToTaggedUser edgeMediaToTaggedUser;
    @SerializedName("edge_media_to_caption")
    @Expose
    private EdgeMediaToCaption edgeMediaToCaption;
    @SerializedName("caption_is_edited")
    @Expose
    private boolean captionIsEdited;
    @SerializedName("edge_media_to_comment")
    @Expose
    private EdgeMediaToComment edgeMediaToComment;
    @SerializedName("comments_disabled")
    @Expose
    private boolean commentsDisabled;
    @SerializedName("taken_at_timestamp")
    @Expose
    private long takenAtTimestamp;
    @SerializedName("edge_media_preview_like")
    @Expose
    private EdgeMediaPreviewLike edgeMediaPreviewLike;
    @SerializedName("video_view_count")
    @Expose
    private Long videoViewCount;
    @SerializedName("edge_media_to_sponsor_user")
    @Expose
    private EdgeMediaToSponsorUser edgeMediaToSponsorUser;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("viewer_has_liked")
    @Expose
    private boolean viewerHasLiked;
    @SerializedName("viewer_has_saved")
    @Expose
    private boolean viewerHasSaved;
    @SerializedName("viewer_has_saved_to_collection")
    @Expose
    private boolean viewerHasSavedToCollection;
    @SerializedName("owner")
    @Expose
    private Owner_ owner;
    @SerializedName("is_ad")
    @Expose
    private boolean isAd;
    @SerializedName("edge_web_media_to_related_media")
    @Expose
    private EdgeWebMediaToRelatedMedia edgeWebMediaToRelatedMedia;
    @SerializedName("edge_sidecar_to_children")
    @Expose
    private EdgeSidecarToChildren edgeSidecarToChildren;

    public Long getVideoViewCount() {
        return videoViewCount;
    }

    public void setVideoViewCount(Long videoViewCount) {
        this.videoViewCount = videoViewCount;
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

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
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

    public Object getMediaPreview() {
        return mediaPreview;
    }

    public void setMediaPreview(Object mediaPreview) {
        this.mediaPreview = mediaPreview;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public List<DisplayResource> getDisplayResources() {
        return displayResources;
    }

    public void setDisplayResources(List<DisplayResource> displayResources) {
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

    public EdgeMediaToTaggedUser getEdgeMediaToTaggedUser() {
        return edgeMediaToTaggedUser;
    }

    public void setEdgeMediaToTaggedUser(EdgeMediaToTaggedUser edgeMediaToTaggedUser) {
        this.edgeMediaToTaggedUser = edgeMediaToTaggedUser;
    }

    public EdgeMediaToCaption getEdgeMediaToCaption() {
        return edgeMediaToCaption;
    }

    public void setEdgeMediaToCaption(EdgeMediaToCaption edgeMediaToCaption) {
        this.edgeMediaToCaption = edgeMediaToCaption;
    }

    public boolean isCaptionIsEdited() {
        return captionIsEdited;
    }

    public void setCaptionIsEdited(boolean captionIsEdited) {
        this.captionIsEdited = captionIsEdited;
    }

    public EdgeMediaToComment getEdgeMediaToComment() {
        return edgeMediaToComment;
    }

    public void setEdgeMediaToComment(EdgeMediaToComment edgeMediaToComment) {
        this.edgeMediaToComment = edgeMediaToComment;
    }

    public boolean isCommentsDisabled() {
        return commentsDisabled;
    }

    public void setCommentsDisabled(boolean commentsDisabled) {
        this.commentsDisabled = commentsDisabled;
    }

    public long getTakenAtTimestamp() {
        return takenAtTimestamp;
    }

    public void setTakenAtTimestamp(long takenAtTimestamp) {
        this.takenAtTimestamp = takenAtTimestamp;
    }

    public EdgeMediaPreviewLike getEdgeMediaPreviewLike() {
        return edgeMediaPreviewLike;
    }

    public void setEdgeMediaPreviewLike(EdgeMediaPreviewLike edgeMediaPreviewLike) {
        this.edgeMediaPreviewLike = edgeMediaPreviewLike;
    }

    public EdgeMediaToSponsorUser getEdgeMediaToSponsorUser() {
        return edgeMediaToSponsorUser;
    }

    public void setEdgeMediaToSponsorUser(EdgeMediaToSponsorUser edgeMediaToSponsorUser) {
        this.edgeMediaToSponsorUser = edgeMediaToSponsorUser;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public boolean isViewerHasLiked() {
        return viewerHasLiked;
    }

    public void setViewerHasLiked(boolean viewerHasLiked) {
        this.viewerHasLiked = viewerHasLiked;
    }

    public boolean isViewerHasSaved() {
        return viewerHasSaved;
    }

    public void setViewerHasSaved(boolean viewerHasSaved) {
        this.viewerHasSaved = viewerHasSaved;
    }

    public boolean isViewerHasSavedToCollection() {
        return viewerHasSavedToCollection;
    }

    public void setViewerHasSavedToCollection(boolean viewerHasSavedToCollection) {
        this.viewerHasSavedToCollection = viewerHasSavedToCollection;
    }

    public Owner_ getOwner() {
        return owner;
    }

    public void setOwner(Owner_ owner) {
        this.owner = owner;
    }

    public boolean isIsAd() {
        return isAd;
    }

    public void setIsAd(boolean isAd) {
        this.isAd = isAd;
    }

    public EdgeWebMediaToRelatedMedia getEdgeWebMediaToRelatedMedia() {
        return edgeWebMediaToRelatedMedia;
    }

    public void setEdgeWebMediaToRelatedMedia(EdgeWebMediaToRelatedMedia edgeWebMediaToRelatedMedia) {
        this.edgeWebMediaToRelatedMedia = edgeWebMediaToRelatedMedia;
    }

    public EdgeSidecarToChildren getEdgeSidecarToChildren() {
        return edgeSidecarToChildren;
    }

    public void setEdgeSidecarToChildren(EdgeSidecarToChildren edgeSidecarToChildren) {
        this.edgeSidecarToChildren = edgeSidecarToChildren;
    }


}
