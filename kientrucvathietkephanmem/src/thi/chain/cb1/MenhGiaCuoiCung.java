package thi.chain.cb1;

public class MenhGiaCuoiCung extends ATM{

    public MenhGiaCuoiCung(int mengGia) {
        super(mengGia);
    }

    @Override
    ATM ATMKeTiep(ATM ketiep) {
        return null;
    }

    @Override
    void Xuly(int sotien) {
        if(sotien>MengGia){
            System.out.printf("\nRut "+sotien+"Mệnh giá "+MengGia);
            return;
        }
        System.out.printf("Không được rút");
    }
}
