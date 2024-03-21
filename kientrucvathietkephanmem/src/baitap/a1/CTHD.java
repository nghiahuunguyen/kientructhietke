package baitap.a1;

public class CTHD {
    String sanpham;
    int soluong;
    double dongia,chietkhau;

    public CTHD(String sanpham, int soluong, double dongia, double chietkhau) {
        this.sanpham = sanpham;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
    }

    @Override
    public String toString() {
        StringBuilder builder= new StringBuilder();
        builder.append(sanpham).append("\t")
                .append("số lượng: ").append(soluong)
                .append("đơn giá: ").append(dongia)
                .append("chiết khẩu: ").append(chietkhau);
        return builder.toString();
    }

    public String getSanpham() {
        return sanpham;
    }

    public void setSanpham(String sanpham) {
        this.sanpham = sanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getChietkhau() {
        return chietkhau;
    }

    public void setChietkhau(double chietkhau) {
        this.chietkhau = chietkhau;
    }
}
