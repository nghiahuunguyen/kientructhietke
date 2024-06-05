package baitap.cb3;

public class BacCaoNhat extends TienDienBacThang {
    public BacCaoNhat(String tenBac, int min, int max, float gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    TienDienBacThang TienDienBacThangketiep(TienDienBacThang ketiep) {
        return null;
    }

    @Override
    float xuly(float sokw) {
        return (sokw - min) * gia;
    }
}