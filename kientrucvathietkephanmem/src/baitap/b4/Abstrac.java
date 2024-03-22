package baitap.b4;

public abstract class Abstrac {
    String ten;

    public Abstrac(String ten) {
        this.ten = ten;
    }
    public abstract void lietkemonhoc();
    public abstract int tongsotinchi();
    public abstract double tonghocphi();
    public abstract void add(Abstrac monhoc);
    public abstract void remove(Abstrac monhoc);
}
