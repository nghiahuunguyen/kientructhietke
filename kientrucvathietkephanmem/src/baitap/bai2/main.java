package baitap.bai2;

import baitap.bai1.nhanvien;

public class main {
    public static void main(String[] args) {
        nhanvien nv1=new nhanvien("nghia",20,"dl",10000,400);
        nhanvien nv2=new nhanvien("nghia1",20,"dl",10000,400);
        quanlisv ql =new quanlisv();
        ql.them(nv1);
        ql.them(nv2);
        ql.inds();
    }
}
