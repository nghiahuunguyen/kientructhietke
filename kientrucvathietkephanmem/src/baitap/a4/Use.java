package baitap.a4;

public class Use {
    String ten;

    public Use(String ten) {
        this.ten = ten;
    }
    public void vote(Candidate c){
        Election.Instance().vote(c);
    }
}
