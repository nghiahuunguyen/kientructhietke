package baitap.cb1;

public class main {
    public static void main(String[] args) {
        ATM namTram = new MenhGiaATM(500);
        ATM motTram = new MenhGiaATM(100);
        ATM namChuc = new MenhGiaATM(50);
        ATM muoiNghin = new MenhGiaATM(10);
        ATM motNghin = new MenhGiaThapNhat(1);

        namTram.thietLapMenhGiaThapHon(motTram)
                .thietLapMenhGiaThapHon(namChuc)
                .thietLapMenhGiaThapHon(muoiNghin)
                .thietLapMenhGiaThapHon(motNghin);

        namTram.rutTien(293);
    }
}
