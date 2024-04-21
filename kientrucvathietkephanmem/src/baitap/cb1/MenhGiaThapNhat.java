package baitap.cb1;

public class MenhGiaThapNhat extends ATM{
    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM thietLapMenhGiaThapHon(ATM atm) {
        return null;
    }

    @Override
    public void rutTien(int soTien) {
        System.out.println(soTien + " tờ mệnh giá " + menhGia);
    }
}
