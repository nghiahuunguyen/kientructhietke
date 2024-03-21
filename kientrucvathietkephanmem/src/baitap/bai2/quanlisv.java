package baitap.bai2;
import baitap.bai1.nhanvien;

import java.util.ArrayList;
import java.util.List;

class quanlisv implements Iquanly{
    private List<nhanvien> danhSach;

    public quanlisv() {
        danhSach = new ArrayList<>();
    }

    @Override
    public void them(nhanvien nhanvien) {
        danhSach.add(nhanvien);
    }

    @Override
    public void inds() {
        for(nhanvien nv:danhSach){
            System.out.println(nv.toString());
        }
    }
}
