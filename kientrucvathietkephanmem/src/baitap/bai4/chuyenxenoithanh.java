package baitap.bai4;

public class chuyenxenoithanh extends Chuyenxe {
    int sotuyen,sokm;

    @Override
    public String toString() {
        String st =super.toString();
        st =st+"Số tuyến: "+sotuyen +"\n"+
                "Số km: "+sokm+"\n";
        return st;
    }

    public int getSotuyen() {
        return sotuyen;
    }

    public void setSotuyen(int sotuyen) {
        this.sotuyen = sotuyen;
    }

    public int getSokm() {
        return sokm;
    }

    public void setSokm(int sokm) {
        this.sokm = sokm;
    }

    public chuyenxenoithanh(String masochuyen, String taixe, String soxe, float doanhthu, int sotuyen, int sokm) {
        super(masochuyen, taixe, soxe, doanhthu);//khoitoa theo lop cha
        this.sotuyen = sotuyen;
        this.sokm = sokm;
    }
}
