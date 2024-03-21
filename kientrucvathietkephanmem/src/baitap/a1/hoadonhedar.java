package baitap.a1;

public class hoadonhedar {
    String mahoadon;
    String ngayban;
    String tenkhachhang;

    public hoadonhedar(String mahoadon, String ngayban, String tenkhachhang) {
        this.mahoadon = mahoadon;
        this.ngayban = ngayban;
        this.tenkhachhang = tenkhachhang;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mã hóa đơn: ").append(mahoadon)
                .append("\nNgày bán: ").append(ngayban)
                .append("\nTên khách hàng: ").append(tenkhachhang);
        return builder.toString();
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getNgayban() {
        return ngayban;
    }

    public void setNgayban(String ngayban) {
        this.ngayban = ngayban;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }
}
