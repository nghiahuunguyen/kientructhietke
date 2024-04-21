package baitap.cb3;

public class BacCaoNhat extends TienDienBacThang {
    public BacCaoNhat(String tenbac, int max, int min, int gia) {
        super(tenbac, max, min, gia);
    }

    @Override
    public TienDienBacThang ketiep(TienDienBacThang k) {
        return null;
    }

    @Override
    public int tinhTienDien(int soKW) {
        return (soKW - min) * gia;
    }
}