package thi.chain.cb4;

import java.util.List;

public abstract class Veso {
    String tengiai;
    List<String>sotrungthuong;

    public Veso(List<String> sotrungthuong, String tengiai) {
        this.sotrungthuong = sotrungthuong;
        this.tengiai = tengiai;
    }

    abstract Veso vesoketiep(Veso ketiep);
    abstract void xuly(String sodo);
}
