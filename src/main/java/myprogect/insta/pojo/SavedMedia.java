
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SavedMedia {

    @SerializedName("nodes")
    @Expose
    private List<Object> nodes = new ArrayList<Object>();
    @SerializedName("count")
    @Expose
    private long count;
    @SerializedName("page_info")
    @Expose
    private PageInfo_ pageInfo;

    public List<Object> getNodes() {
        return nodes;
    }

    public void setNodes(List<Object> nodes) {
        this.nodes = nodes;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public PageInfo_ getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo_ pageInfo) {
        this.pageInfo = pageInfo;
    }


}
