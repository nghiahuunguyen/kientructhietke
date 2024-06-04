package thi.cb1;

public class main {
    public static void main(String[] args) {
        ATM namtram=new MenhGiaThongThuong(500);
        ATM haitram=new MenhGiaThongThuong(200);
        ATM mottram=new MenhGiaThongThuong(100);
        ATM namchuc=new MenhGiaThongThuong(50);
        ATM muoi=new MenhGiaThongThuong(10);
        ATM motngan=new MenhGiaCuoiCung(1);
        namtram.ATMKeTiep(haitram)
                .ATMKeTiep(mottram)
                .ATMKeTiep(namchuc)
                .ATMKeTiep(muoi)
                .ATMKeTiep(motngan);
        namtram.XuLy(300);
    }
}
