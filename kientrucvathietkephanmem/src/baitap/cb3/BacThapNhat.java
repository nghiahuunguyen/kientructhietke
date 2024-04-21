package baitap.cb3;

public class BacThapNhat extends TienDienBacThang {
    private TienDienBacThang k;

    public BacThapNhat(String tenbac, int max, int min, int gia, TienDienBacThang k) {
        super(tenbac, max, min, gia);
        this.k = k;
    }

    @Override
    public TienDienBacThang ketiep(TienDienBacThang k) {
        this.k = k;
        return this;
    }

    @Override
    public int tinhTienDien(int soKW) {
        if (soKW <= max) {
            return (soKW - min) * gia;
        } else {
            int tienDienBacKeTiep = k.tinhTienDien(soKW);
            return (max - min) * gia + tienDienBacKeTiep;
        }
    }
}