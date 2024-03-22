package baitap.b4;

public class monhoc extends Abstrac{
    int sotinchi;
    double hocphi;

    public monhoc(String ten, int sotinchi, double hocphi) {
        super(ten);
        this.sotinchi = sotinchi;
        this.hocphi = hocphi;
    }

    @Override
    public void lietkemonhoc() {
        System.out.println("Tên môn học: "+ten);
    }

    @Override
    public int tongsotinchi() {
        return sotinchi;
    }

    @Override
    public double tonghocphi() {
        return hocphi;
    }

    @Override
    public void add(Abstrac monhoc) {

    }

    @Override
    public void remove(Abstrac monhoc) {

    }
}
