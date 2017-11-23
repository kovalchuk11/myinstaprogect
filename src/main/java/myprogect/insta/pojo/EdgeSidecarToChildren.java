
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class EdgeSidecarToChildren {

    @SerializedName("edges")
    @Expose
    private List<Edge___> edges = new ArrayList<Edge___>();

    public List<Edge___> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge___> edges) {
        this.edges = edges;
    }

}
