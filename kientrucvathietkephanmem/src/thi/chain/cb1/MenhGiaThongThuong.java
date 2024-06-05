package thi.chain.cb1;

public class MenhGiaThongThuong extends ATM{
    ATM tieptheo;
    public MenhGiaThongThuong(int mengGia) {
        super(mengGia);
    }

    @Override
    ATM ATMKeTiep(ATM ketiep) {
        tieptheo=ketiep;
        return tieptheo;
    }

    @Override
    void Xuly(int sotien) {
        int soto=sotien/MengGia;
        int tiendu=sotien%MengGia;
        if(soto>0){
            System.out.printf("\nRut "+soto+"Mệnh giá "+MengGia);
        }
        if(tiendu>0){
            tieptheo.Xuly(tiendu);
        }
    }
}
