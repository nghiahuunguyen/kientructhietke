package thi.cb1;

public class MenhGiaThongThuong extends ATM{
    ATM tieptheo;
    public MenhGiaThongThuong(int menhGia) {
        super(menhGia);
    }

    @Override
    ATM ATMKeTiep(ATM ketiep) {
        tieptheo=ketiep;
        return tieptheo;
    }

    @Override
    void XuLy(int sotien) {
        int soto=sotien/MenhGia;
        int tiendu=sotien%MenhGia;
        if(soto>0){
            System.out.printf("\nRút "+soto+" mệnh giá "+MenhGia);
        }
        if(tiendu>0){
           tieptheo.XuLy(tiendu);
        }
    }
}
