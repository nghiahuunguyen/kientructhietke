package Iterator;

public class MonHocK63 {

    String ten;
    int soTc;

    public MonHocK63(String ten, int soTc) {
        this.ten = ten;
        this.soTc = soTc;
    }

    @Override
    public String toString() {
        return "MonHocK63{" +
                "ten='" + ten + '\'' +
                ", soTc=" + soTc +
                '}';
    }

    public String getTen() {
        return ten;
    }

    public int getSoTc() {
        return soTc;
    }
}
