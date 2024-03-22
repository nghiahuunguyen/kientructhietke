package baitap.b4;

public class main {
    public static void main(String[] args) {
        kyhoc kyHoc1 = new kyhoc("Học kỳ 1");
        kyhoc kyHoc2 = new kyhoc("Học kỳ 2");
        khoahoc khoahoc1 = new khoahoc("Khóa 63");
        namhoc  namHoc1 = new namhoc("",2024);
        monhoc monhoc1 = new monhoc("KTVATKPM",3,1200_000);
        monhoc monhoc2 = new monhoc("LTTBDD",4,2400_000);
        monhoc monhoc3 = new monhoc("TTNT",3,1200_000);
        monhoc monhoc4 = new monhoc("KTPM",3,1200_000);

        khoahoc1.add(namHoc1);

        namHoc1.add(kyHoc1);
        namHoc1.add(kyHoc2);

        kyHoc1.add(monhoc1);
        kyHoc1.add(monhoc2);
        kyHoc2.add(monhoc3);
        kyHoc2.add(monhoc4);

        khoahoc1.lietkemonhoc();
        System.out.println("Tổng số tín chỉ: "+khoahoc1.tongsotinchi());
        System.out.println("Tổng học phí: "+khoahoc1.tonghocphi());
    }
}
