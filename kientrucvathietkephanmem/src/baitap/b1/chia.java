package baitap.b1;

public class chia extends bieuthucdecorator{
    int toanhang;

    @Override
    public float giatri() {
        return super.giatri()/toanhang;
    }

    @Override
    public String bieuthuc() {
        return "("+toanhang+"+"+String.valueOf(toanhang)+")";
    }

    public chia(bieuthuc bieuthuc, int toanhang) {
        super(bieuthuc);
        this.toanhang = toanhang;
    }
}
