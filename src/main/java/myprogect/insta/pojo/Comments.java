
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Comments {

    @SerializedName("count")
    @Expose
    private long count;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }


}
