package baitap.cb3;

public class BacThapNhat extends TienDienBacThang {
    TienDienBacThang tieptheo;

    public BacThapNhat(String tenBac, int min, int max, float gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    TienDienBacThang TienDienBacThangketiep(TienDienBacThang ketiep) {
        tieptheo=ketiep;
        return tieptheo;
    }

    @Override
    float xuly(float sokw) {
        if(sokw<=max)
            return (sokw-min)*gia;
        else
            return (max-min)*gia+ tieptheo.xuly(sokw);
    }
}