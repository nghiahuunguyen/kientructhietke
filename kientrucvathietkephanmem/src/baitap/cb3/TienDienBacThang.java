package baitap.cb3;

public abstract class TienDienBacThang {
    String tenbac;
    int max,min,gia;

    public TienDienBacThang(String tenbac, int max, int min, int gia) {
        this.tenbac = tenbac;
        this.max = max;
        this.min = min;
        this.gia = gia;
    }
    public abstract TienDienBacThang ketiep(TienDienBacThang k);
    public abstract int tinhTienDien(int soKW);
}
