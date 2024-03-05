package baitap.cc2;

public class sinhvien {
    String hoten,ngaysinh;
    float diemtb;

    @Override
    public String toString() {
        return "Họ tên sv: "+hoten+"\n"+
                "Ngày sinh: "+ngaysinh+"\n"+
                "Điểm tb: "+diemtb+"\n";
    }
    public String getHoten() {
        return hoten;
    }

    public sinhvien(String hoten, String ngaysinh, float diemtb) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diemtb = diemtb;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }
}
