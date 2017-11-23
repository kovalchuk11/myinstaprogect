
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner_ {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("profile_pic_url")
    @Expose
    private String profilePicUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("blocked_by_viewer")
    @Expose
    private boolean blockedByViewer;
    @SerializedName("followed_by_viewer")
    @Expose
    private boolean followedByViewer;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("has_blocked_viewer")
    @Expose
    private boolean hasBlockedViewer;
    @SerializedName("is_private")
    @Expose
    private boolean isPrivate;
    @SerializedName("is_unpublished")
    @Expose
    private boolean isUnpublished;
    @SerializedName("is_verified")
    @Expose
    private boolean isVerified;
    @SerializedName("requested_by_viewer")
    @Expose
    private boolean requestedByViewer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isBlockedByViewer() {
        return blockedByViewer;
    }

    public void setBlockedByViewer(boolean blockedByViewer) {
        this.blockedByViewer = blockedByViewer;
    }

    public boolean isFollowedByViewer() {
        return followedByViewer;
    }

    public void setFollowedByViewer(boolean followedByViewer) {
        this.followedByViewer = followedByViewer;
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

    public boolean isIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public boolean isIsUnpublished() {
        return isUnpublished;
    }

    public void setIsUnpublished(boolean isUnpublished) {
        this.isUnpublished = isUnpublished;
    }

    public boolean isIsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public boolean isRequestedByViewer() {
        return requestedByViewer;
    }

    public void setRequestedByViewer(boolean requestedByViewer) {
        this.requestedByViewer = requestedByViewer;
    }


}
