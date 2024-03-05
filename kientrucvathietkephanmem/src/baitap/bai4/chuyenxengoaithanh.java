package baitap.bai4;

import java.util.Date;

/*Công ty vận tải V quản lý thông tin là các chuyến xe. Thông tin của 2 loại chuyến xe:
- Chuyến xe nội thành: Mã số chuyến, Họ tên tài xế, số xe, số tuyến, số km đi được, doanh
thu.
- Chuyến xe ngoại thành: Mã số chuyến, Họ tên tài xế, số xe, nơi đến, số ngày đi, doanh thu.*/
public class chuyenxengoaithanh extends Chuyenxe{
    String noiden;
    int songay;

    @Override
    public String toString() {
        String st =super.toString();
        st = st+"Nơi đêến "+noiden+"\n"+
                "số ngày đi "+songay;
        return st;
    }

    public chuyenxengoaithanh(String masochuyen, String taixe, String soxe, float doanhthu, String noiden, int songay) {
        super(masochuyen, taixe, soxe, doanhthu);
        this.noiden = noiden;
        this.songay = songay;
    }

    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }
}
