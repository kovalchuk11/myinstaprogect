package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashInfo {

    @SerializedName("is_dash_eligible")
    @Expose
    private boolean isDashEligible;
    @SerializedName("video_dash_manifest")
    @Expose
    private Object videoDashManifest;
    @SerializedName("number_of_qualities")
    @Expose
    private long numberOfQualities;

    public boolean isIsDashEligible() {
        return isDashEligible;
    }

    public void setIsDashEligible(boolean isDashEligible) {
        this.isDashEligible = isDashEligible;
    }

    public Object getVideoDashManifest() {
        return videoDashManifest;
    }

    public void setVideoDashManifest(Object videoDashManifest) {
        this.videoDashManifest = videoDashManifest;
    }

    public long getNumberOfQualities() {
        return numberOfQualities;
    }

    public void setNumberOfQualities(long numberOfQualities) {
        this.numberOfQualities = numberOfQualities;
    }


}
