package baitap.cb4;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        DoVeSo giaidb=new GiaiThongThuong("Giải đặc biệc",new ArrayList<String>(Arrays.asList("546728")));
        DoVeSo giai1=new GiaiThongThuong("Giải 1",new ArrayList<String>(Arrays.asList("5468")));
        DoVeSo giai8=new GiaiUt("Giải 8",new ArrayList<String>(Arrays.asList("28")));
        giaidb.giaiKeTiep(giai1)
                .giaiKeTiep(giai8);
        giaidb.doveSo("123428");
    }
}