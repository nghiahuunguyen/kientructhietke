package baitap.cb1;

public class MenhGiaATM extends ATM{
    ATM menhGiaThapHon;

    public MenhGiaATM(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM thietLapMenhGiaThapHon(ATM atm) {
        menhGiaThapHon = atm;
        return atm;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien / menhGia;
        soTien = soTien % menhGia;
        System.out.println(soTo + " tờ mệnh giá " + menhGia);
        if(soTien > 0) menhGiaThapHon.rutTien(soTien);
    }
}
