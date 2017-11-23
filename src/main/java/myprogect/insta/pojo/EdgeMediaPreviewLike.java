
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class EdgeMediaPreviewLike {

    @SerializedName("count")
    @Expose
    private long count;
    @SerializedName("edges")
    @Expose
    private List<Edge__> edges = new ArrayList<Edge__>();

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<Edge__> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge__> edges) {
        this.edges = edges;
    }


}
