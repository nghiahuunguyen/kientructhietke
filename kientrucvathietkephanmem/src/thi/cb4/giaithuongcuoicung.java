package thi.cb4;

import java.util.List;

public class giaithuongcuoicung extends veso{
    public giaithuongcuoicung(String tengiai, List<String> soTrungthuong) {
        super(tengiai, soTrungthuong);
    }

    @Override
    veso vesoketiep(veso ketiep) {
        return null;
    }

    @Override
    void xuly(String sodo) {
        for(String s:soTrungthuong){
            if(sodo.equals(s)){
                System.out.printf("Bạn đã trung giải "+tengiai);

            }
            System.out.printf("chúc bạn may mắn");
        }
    }
}
