package baitap.cb3;

public abstract class TienDienBacThang {
    String tenBac;
    int min,max;
    float gia;

    public TienDienBacThang(String tenBac, int min, int max, float gia) {
        this.tenBac = tenBac;
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    abstract TienDienBacThang TienDienBacThangketiep(TienDienBacThang ketiep);
    abstract float xuly(float sokw);
}
