package thi.cb1;

public abstract class ATM {
    int MenhGia;

    public ATM(int menhGia) {
        MenhGia = menhGia;
    }
    abstract ATM ATMKeTiep (ATM ketiep);
    abstract void XuLy(int sotien);
}
