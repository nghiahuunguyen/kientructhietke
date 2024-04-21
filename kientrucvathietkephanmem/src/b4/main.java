package b4;

public class main {
    public static void main(String[] args) {
        kehoachchung mh=new kehoachchung("2023");
        kehoachchung kehoach=new kehoachchung("học kỳ 1");
        monhoc monhoc=new monhoc("KTLT",3,300);
        monhoc monhoc1=new monhoc("KT",3,300);
        mh.add(kehoach);
        kehoach.add(monhoc);
        kehoach.add(monhoc1);
        System.out.println(mh.thongtin());
    }
}
