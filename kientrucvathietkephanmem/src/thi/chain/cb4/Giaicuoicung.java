package thi.chain.cb4;

import java.util.List;

public class Giaicuoicung extends Veso{
    public Giaicuoicung(List<String> sotrungthuong, String tengiai) {
        super(sotrungthuong, tengiai);
    }

    @Override
    Veso vesoketiep(Veso ketiep) {
        return null;
    }

    @Override
    void xuly(String sodo) {
        for (String s:sotrungthuong){
            if(sodo.equals(s)){
                System.out.printf("Ban da trung giai "+tengiai);
                return;
            }
            System.out.printf("chuc ban may man");
        }
    }
}
