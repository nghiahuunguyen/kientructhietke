package baitap.b1;

public class tru extends bieuthucdecorator{
    float toanhang;

    @Override
    public float giatri() {
        return super.giatri()-toanhang;
    }

    @Override
    public String bieuthuc() {
        return "("+toanhang+"-"+String.valueOf(toanhang)+")";
    }

    public tru(bieuthuc bieuthuc, float toanhang) {
        super(bieuthuc);
        this.toanhang = toanhang;
    }
}
