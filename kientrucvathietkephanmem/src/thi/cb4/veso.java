package thi.cb4;

import java.util.List;

public abstract class veso {
    String tengiai;
    List<String> soTrungthuong;

    public veso(String tengiai, List<String> soTrungthuong) {
        this.tengiai = tengiai;
        this.soTrungthuong = soTrungthuong;
    }
    abstract veso vesoketiep(veso ketiep);
    abstract void xuly(String sodo);
}
