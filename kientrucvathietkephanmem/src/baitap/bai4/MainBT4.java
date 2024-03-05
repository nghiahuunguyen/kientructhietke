package baitap.bai4;

public class MainBT4 {
    public static void main(String[] args) {
        quanlychuyenxe qlcx =new quanlychuyenxe();
        qlcx.them(new chuyenxenoithanh("001","Đức Thắng","79A-115",100000,1,10));
        qlcx.them(new chuyenxenoithanh("002","Đức Nam","79A-113",200000,1,10));
        qlcx.them(new chuyenxenoithanh("003","Đức Tài","79A-114",300000,1,10));
        qlcx.them(new chuyenxengoaithanh("004","Đức Tài","79A-114",300000,"TP HCM",10));
        qlcx.them(new chuyenxengoaithanh("005","Đức Minh","79A-116",500000,"Nha Trang",11));

        qlcx.inDSCX();
        System.out.println("Doanh thu xe nội thành: "+qlcx.doanhthunoithanh());
        System.out.println("Doanh thu xe ngoại thành: "+qlcx.doanhthuxengoaithanh());
        System.out.println("Doanh thu 2 xe : "+qlcx.tongdoanhthu());
    }
}
