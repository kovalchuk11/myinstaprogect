
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class EdgeMediaToComment {

    @SerializedName("count")
    @Expose
    private long count;
    @SerializedName("page_info")
    @Expose
    private PageInfo pageInfo;
    @SerializedName("edges")
    @Expose
    private List<Edge_> edges = new ArrayList<Edge_>();

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<Edge_> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge_> edges) {
        this.edges = edges;
    }



}
