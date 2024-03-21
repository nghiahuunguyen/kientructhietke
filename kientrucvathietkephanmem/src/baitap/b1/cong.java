package baitap.b1;

public class cong extends bieuthucdecorator{
    float toanhang;

    @Override
    public float giatri() {
        return super.giatri()+toanhang;
    }

    @Override
    public String bieuthuc() {
        return "("+ bieuthuc.bieuthuc()+"+"+String.valueOf(toanhang)+")";
    }

    public cong(bieuthuc bieuthuc, float toanhang) {
        super(bieuthuc);
        this.toanhang = toanhang;
    }
}
