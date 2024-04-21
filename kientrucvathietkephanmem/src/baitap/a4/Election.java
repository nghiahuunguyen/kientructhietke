package baitap.a4;

public class Election {
    private static Election instance;
    int trump = 0, joe_biden= 0;

    public Election() {
    }
    public static Election Instance(){
        if(instance==null){
            instance=new Election();
        }
        return instance;
    }
    public void vote(Candidate c){
        if(c == Candidate.BIDEN)
            joe_biden++;
        else if (c == Candidate.TRUMP)
            trump++;
    }
}
