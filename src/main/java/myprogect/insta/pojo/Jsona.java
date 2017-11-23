
package myprogect.insta.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Jsona {

    @SerializedName("graphql")
    @Expose
    private Graphql graphql;
	@SerializedName("user")
    @Expose
    private User user;
    @SerializedName("logging_page_id")
    @Expose
    private String loggingPageId;

    public Graphql getGraphql() {
        return graphql;
    }

    public void setGraphql(Graphql graphql) {
        this.graphql = graphql;
    }
	public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLoggingPageId() {
        return loggingPageId;
    }

    public void setLoggingPageId(String loggingPageId) {
        this.loggingPageId = loggingPageId;
    }


}
