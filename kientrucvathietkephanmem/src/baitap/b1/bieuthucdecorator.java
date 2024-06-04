package baitap.b1;

public class bieuthucdecorator extends bieuthuc {
    protected bieuthuc bieuthuc;

    public bieuthucdecorator(bieuthuc bieuthuc) {
        this.bieuthuc = bieuthuc;
    }

    @Override
    public float giatri() {
        return bieuthuc.giatri();
    }

    @Override
    public String bieuthuc() {
        return String.valueOf(bieuthuc.giatri());
    }
}
