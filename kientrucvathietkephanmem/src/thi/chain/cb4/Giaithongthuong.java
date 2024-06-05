package thi.chain.cb4;

import java.util.List;

public class Giaithongthuong extends Veso{
    Veso tieptheo;
    public Giaithongthuong(List<String> sotrungthuong, String tengiai) {
        super(sotrungthuong, tengiai);
    }

    @Override
    Veso vesoketiep(Veso ketiep) {
        tieptheo=ketiep;
        return tieptheo;
    }

    @Override
    void xuly(String sodo) {
        for(String s:sotrungthuong){
            if(sodo.endsWith(s)){
                System.out.printf("Ban da trung giai "+tengiai);
            }
            else {
                tieptheo.xuly(sodo);
            }
        }
    }
}
