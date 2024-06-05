package thi.chain.cb4;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Veso giaitam=new Giaithongthuong(new ArrayList<>(Arrays.asList("56")),"giai tam");
        Veso giainhi=new Giaithongthuong(new ArrayList<>(Arrays.asList("1234")),"giai nhi");
        Veso giainhat=new Giaithongthuong(new ArrayList<>(Arrays.asList("25678")),"giai nhat");
        Veso giaidb=new Giaicuoicung(new ArrayList<>(Arrays.asList("675418")),"giai db");
        giaitam.vesoketiep(giainhi)
                .vesoketiep(giainhat)
                .vesoketiep(giaidb);
        giaitam.xuly("123456");
    }
}
