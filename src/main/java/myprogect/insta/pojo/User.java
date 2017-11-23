
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("biography")
    @Expose
    private String biography;
    @SerializedName("blocked_by_viewer")
    @Expose
    private boolean blockedByViewer;
    @SerializedName("country_block")
    @Expose
    private boolean countryBlock;
    @SerializedName("external_url")
    @Expose
    private Object externalUrl;
    @SerializedName("external_url_linkshimmed")
    @Expose
    private Object externalUrlLinkshimmed;
    @SerializedName("followed_by")
    @Expose
    private FollowedBy followedBy;
    @SerializedName("followed_by_viewer")
    @Expose
    private boolean followedByViewer;
    @SerializedName("follows")
    @Expose
    private Follows follows;
    @SerializedName("follows_viewer")
    @Expose
    private boolean followsViewer;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("has_blocked_viewer")
    @Expose
    private boolean hasBlockedViewer;
    @SerializedName("has_requested_viewer")
    @Expose
    private boolean hasRequestedViewer;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_private")
    @Expose
    private boolean isPrivate;
    @SerializedName("is_verified")
    @Expose
    private boolean isVerified;
    @SerializedName("profile_pic_url")
    @Expose
    private String profilePicUrl;
    @SerializedName("profile_pic_url_hd")
    @Expose
    private String profilePicUrlHd;
    @SerializedName("requested_by_viewer")
    @Expose
    private boolean requestedByViewer;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("connected_fb_page")
    @Expose
    private Object connectedFbPage;
    @SerializedName("media")
    @Expose
    private Media media;
    @SerializedName("saved_media")
    @Expose
    private SavedMedia savedMedia;

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public boolean isBlockedByViewer() {
        return blockedByViewer;
    }

    public void setBlockedByViewer(boolean blockedByViewer) {
        this.blockedByViewer = blockedByViewer;
    }

    public boolean isCountryBlock() {
        return countryBlock;
    }

    public void setCountryBlock(boolean countryBlock) {
        this.countryBlock = countryBlock;
    }

    public Object getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(Object externalUrl) {
        this.externalUrl = externalUrl;
    }

    public Object getExternalUrlLinkshimmed() {
        return externalUrlLinkshimmed;
    }

    public void setExternalUrlLinkshimmed(Object externalUrlLinkshimmed) {
        this.externalUrlLinkshimmed = externalUrlLinkshimmed;
    }

    public FollowedBy getFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(FollowedBy followedBy) {
        this.followedBy = followedBy;
    }

    public boolean isFollowedByViewer() {
        return followedByViewer;
    }

    public void setFollowedByViewer(boolean followedByViewer) {
        this.followedByViewer = followedByViewer;
    }

    public Follows getFollows() {
        return follows;
    }

    public void setFollows(Follows follows) {
        this.follows = follows;
    }

    public boolean isFollowsViewer() {
        return followsViewer;
    }

    public void setFollowsViewer(boolean followsViewer) {
        this.followsViewer = followsViewer;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isHasBlockedViewer() {
        return hasBlockedViewer;
    }

    public void setHasBlockedViewer(boolean hasBlockedViewer) {
        this.hasBlockedViewer = hasBlockedViewer;
    }

    public boolean isHasRequestedViewer() {
        return hasRequestedViewer;
    }

    public void setHasRequestedViewer(boolean hasRequestedViewer) {
        this.hasRequestedViewer = hasRequestedViewer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public boolean isIsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getProfilePicUrlHd() {
        return profilePicUrlHd;
    }

    public void setProfilePicUrlHd(String profilePicUrlHd) {
        this.profilePicUrlHd = profilePicUrlHd;
    }

    public boolean isRequestedByViewer() {
        return requestedByViewer;
    }

    public void setRequestedByViewer(boolean requestedByViewer) {
        this.requestedByViewer = requestedByViewer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getConnectedFbPage() {
        return connectedFbPage;
    }

    public void setConnectedFbPage(Object connectedFbPage) {
        this.connectedFbPage = connectedFbPage;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public SavedMedia getSavedMedia() {
        return savedMedia;
    }

    public void setSavedMedia(SavedMedia savedMedia) {
        this.savedMedia = savedMedia;
    }


}
