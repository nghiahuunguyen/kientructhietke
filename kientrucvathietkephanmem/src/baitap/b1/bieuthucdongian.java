package baitap.b1;

public class bieuthucdongian extends bieuthuc {
    float toanhang;

    public bieuthucdongian(float toanhang) {
        this.toanhang = toanhang;
    }

    @Override
    public float giatri() {
        return toanhang;
    }

    @Override
    public String bieuthuc() {
        return String.valueOf(toanhang);
    }
}
