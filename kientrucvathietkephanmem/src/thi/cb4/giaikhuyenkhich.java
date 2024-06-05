package thi.cb4;

import java.util.List;

public class giaikhuyenkhich extends veso {

    public giaikhuyenkhich(String tengiai, List<String> soTrungthuong) {
        super(tengiai, soTrungthuong);
    }

    @Override
    veso vesoketiep(veso ketiep) {
        return ketiep;
    }

    @Override
    void xuly(String sodo) {
        for (String s : soTrungthuong) {
            if (sodo.startsWith(s)) {
                System.out.printf("Bạn đã trung giải "+tengiai);
                return;
            }
        }

    }
}