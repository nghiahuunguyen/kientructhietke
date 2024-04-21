package baitap.cb1;

public abstract class ATM {
    int menhGia;

    public ATM(int menhGia) {
        this.menhGia = menhGia;
    }

    public abstract ATM thietLapMenhGiaThapHon(ATM atm);

    public abstract void rutTien(int soTien);
}
