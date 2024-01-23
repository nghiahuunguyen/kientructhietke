package bt_java.Lab1.BT2;

import bt_java.Lab1.Sinhvien;

import java.util.ArrayList;
import java.util.List;

class QuanLinv implements IQuanLy {
    private List<Sinhvien> danhSach;

    public QuanLinv() {
        danhSach = new ArrayList<>();
    }

    @Override
    public void them(Sinhvien sv) {
        danhSach.add(sv);
    }

    @Override
    public void inDS() {
        for (Sinhvien sv : danhSach) {
            System.out.println(sv.toString());
        }
    }
}