
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PageInfo {

    @SerializedName("has_next_page")
    @Expose
    private boolean hasNextPage;
    @SerializedName("end_cursor")
    @Expose
    private String endCursor;

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public String getEndCursor() {
        return endCursor;
    }

    public void setEndCursor(String endCursor) {
        this.endCursor = endCursor;
    }


}
