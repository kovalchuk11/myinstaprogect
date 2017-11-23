
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PageInfo_ {

    @SerializedName("has_next_page")
    @Expose
    private boolean hasNextPage;
    @SerializedName("end_cursor")
    @Expose
    private Object endCursor;

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public Object getEndCursor() {
        return endCursor;
    }

    public void setEndCursor(Object endCursor) {
        this.endCursor = endCursor;
    }


}
