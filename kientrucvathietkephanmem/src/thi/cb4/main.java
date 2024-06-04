package thi.cb4;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        veso giaitam=new giaitthuonghuongthuong("giải tám",new ArrayList<>(Arrays.asList("56")));
        veso giainhat=new giaitthuonghuongthuong("giải nhất",new ArrayList<>(Arrays.asList("45782")));
        veso giainhi=new giaitthuonghuongthuong("giải nhì",new ArrayList<>(Arrays.asList("11253")));
        veso giaidb=new giaitthuonghuongthuong("giải db",new ArrayList<>(Arrays.asList("112521")));
        giaitam.vesoketiep(giainhi)
                .vesoketiep(giainhat)
                .vesoketiep(giaidb);
        giaitam.xuly("234556");
    }
}
