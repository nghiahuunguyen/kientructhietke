package bt_java.Lab1.BT2;

import bt_java.Lab1.Sinhvien;

public class Mainbt2 {
    public static void main(String[] args) {
        IQuanLy quanLy = new QuanLinv();
        Sinhvien sv1 = new Sinhvien("Nghia", "Dien lac", 20, 10000, 20);
        Sinhvien sv2 = new Sinhvien("Nghiadh", "Dien lac", 20, 10000, 20);
        Sinhvien sv3 = new Sinhvien("Nghiahuu", "Dien lac", 20, 10000, 20);
        Sinhvien sv4 = new Sinhvien("Nghiad", "Dien lac", 20, 10000, 20);
        Sinhvien sv5 = new Sinhvien("Nghiah", "Dien lac", 20, 10000, 20);
        quanLy.them(sv1);
        quanLy.them(sv2);
        quanLy.them(sv3);
        quanLy.them(sv4);
        quanLy.them(sv5);
        quanLy.inDS();
    }
}