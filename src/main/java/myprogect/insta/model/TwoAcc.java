package myprogect.insta.model;

public class TwoAcc {
private String first;
private String second;

    public TwoAcc(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public TwoAcc() {
    }

    public String getFirst() {

        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }
}
