package myprogect.insta.model;

public class Averagedata {
    String url;
    String ot;
    String po;

    public Averagedata() {
    }

    public Averagedata(String url, String ot, String po) {
        this.url = url;
        this.ot = ot;
        this.po = po;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    @Override
    public String toString() {
        return "Averagedata{" +
                "url= '" + url + '\'' +
                ", ot= '" + ot + '\'' +
                ", po= '" + po + '\'' +
                '}';
    }
}
