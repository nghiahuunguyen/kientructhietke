package thi.cb1;

public class MenhGiaCuoiCung extends ATM {
    public MenhGiaCuoiCung(int menhGia) {
        super(menhGia);
    }

    @Override
    ATM ATMKeTiep(ATM ketiep) {
        return null;
    }

    @Override
    void XuLy(int sotien) {
        if(sotien>MenhGia){
            System.out.printf("\nRút "+sotien+" Mệnh giá "+MenhGia);
            return;
        }
        System.out.printf("không được rút");
    }
}
