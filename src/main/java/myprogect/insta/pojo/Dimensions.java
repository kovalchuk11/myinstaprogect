
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dimensions {

    @SerializedName("height")
    @Expose
    private long height;
    @SerializedName("width")
    @Expose
    private long width;

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }



}
