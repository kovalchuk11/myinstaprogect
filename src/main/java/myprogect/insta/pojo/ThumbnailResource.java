
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ThumbnailResource {

    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("config_width")
    @Expose
    private long configWidth;
    @SerializedName("config_height")
    @Expose
    private long configHeight;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public long getConfigWidth() {
        return configWidth;
    }

    public void setConfigWidth(long configWidth) {
        this.configWidth = configWidth;
    }

    public long getConfigHeight() {
        return configHeight;
    }

    public void setConfigHeight(long configHeight) {
        this.configHeight = configHeight;
    }


}
