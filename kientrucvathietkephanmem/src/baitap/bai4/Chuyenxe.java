package baitap.bai4;

public abstract class Chuyenxe {
    String masochuyen,taixe,soxe;
    float doanhthu;

    @Override
    public String toString() {
        return "Mã số chuyến: "+masochuyen+"\n"+
        "Tài xế: "+taixe+"\n"+
         "Số xe: "+soxe+"\n"+
         "Doanh thi: "+doanhthu+"\n";
    }

    public Chuyenxe(String masochuyen, String taixe, String soxe, float doanhthu) {
        this.masochuyen = masochuyen;
        this.taixe = taixe;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }

    public String getMasochuyen() {
        return masochuyen;
    }

    public void setMasochuyen(String masochuyen) {
        this.masochuyen = masochuyen;
    }

    public String getTaixe() {
        return taixe;
    }

    public void setTaixe(String taixe) {
        this.taixe = taixe;
    }

    public String getSoxe() {
        return soxe;
    }

    public void setSoxe(String soxe) {
        this.soxe = soxe;
    }

    public float getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(float doanhthu) {
        this.doanhthu = doanhthu;
    }
}
