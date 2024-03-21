package baitap.a6;

public class main {
    public static void main(String[] args) {

        UT1 u1 = new UT1();
        UT2 u2 = new UT2();
        u1.add(new SanPham("SP001", "Tivi", 10, 100.0),"1");
        u1.add(new SanPham("SP002", "Laptop", 10, 200.0),"2");
        u2.add(new SanPham("SP003", "Pc", 10, 100.0),"1");
        u1.add(new SanPham("SP004", "Máy giặt", 10, 100.0),"2");
        u1.inds("1");
    }
}