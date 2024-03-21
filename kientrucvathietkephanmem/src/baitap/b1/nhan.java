package baitap.b1;

public class nhan extends bieuthucdecorator{
    int toanhang;

    public nhan(bieuthuc bieuthuc, int toanhang) {
        super(bieuthuc);
        this.toanhang = toanhang;
    }

    @Override
    public float giatri() {
        return super.giatri()*toanhang;
    }

    @Override
    public String bieuthuc() {
        return "("+toanhang+"*"+String.valueOf(toanhang)+")";
    }
}
