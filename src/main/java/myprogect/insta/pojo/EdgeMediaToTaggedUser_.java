
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class EdgeMediaToTaggedUser_ {

    @SerializedName("edges")
    @Expose
    private List<Object> edges = new ArrayList<Object>();

    public List<Object> getEdges() {
        return edges;
    }

    public void setEdges(List<Object> edges) {
        this.edges = edges;
    }

}
