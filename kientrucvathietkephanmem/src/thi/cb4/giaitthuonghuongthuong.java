package thi.cb4;

import java.util.List;

public class giaitthuonghuongthuong extends veso{
    veso tieptheo;
    public giaitthuonghuongthuong(String tengiai, List<String> soTrungthuong) {
        super(tengiai, soTrungthuong);
    }

    @Override
    veso vesoketiep(veso ketiep) {
        tieptheo=ketiep;
        return tieptheo;
    }

    @Override
    void xuly(String sodo) {
        for(String s:soTrungthuong){
            if(sodo.endsWith(s)){
                System.out.printf("Bạn đã trung giải "+tengiai);
            }
            else {
                tieptheo.xuly(sodo);
            }
        }
    }
}
