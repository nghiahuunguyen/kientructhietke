package baitap.a6;

public class SanPham {
    String masp,tensp;
    int soluong;
    double dongia;

    public SanPham(String masp, String tensp, int soluong, double dongia) {
        this.masp = masp;
        this.tensp = tensp;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mã sp: '").append(masp).append('\n')
                .append("Tên sp: '").append(tensp).append('\n')
                .append("Số lượng: ").append(soluong).append('\n')
                .append("Đơn giá: ").append(dongia);
        return sb.toString();
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
}
