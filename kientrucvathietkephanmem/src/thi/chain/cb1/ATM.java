package thi.chain.cb1;

public abstract class ATM {
    int MengGia;

    public ATM(int mengGia) {
        MengGia = mengGia;
    }
    abstract ATM ATMKeTiep(ATM ketiep);
    abstract void Xuly(int sotien);
}
