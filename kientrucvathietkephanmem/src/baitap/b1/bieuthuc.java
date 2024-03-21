package baitap.b1;

public abstract class bieuthuc {
    public abstract float giatri();
    public abstract String bieuthuc();

    @Override
    public String toString() {
        return giatri() +"="+bieuthuc();
    }
}
