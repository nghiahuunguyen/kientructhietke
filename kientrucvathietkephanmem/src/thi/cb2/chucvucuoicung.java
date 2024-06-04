package thi.cb2;

public class chucvucuoicung extends Vay{
    public chucvucuoicung(String tennguoiduyet, String chucvu, int sotien) {
        super(tennguoiduyet, chucvu, sotien);
    }

    @Override
    Vay vayketiep(Vay kiep) {
        return null;
    }

    @Override
    void xuly(int sotienvay) {
        if(sotien>=sotienvay){
            System.out.printf("Tên người duyệt "+tennguoiduyet+" Chức vụ "+chucvu+" Số tiền vay "+sotienvay);
            return;
        }
        System.out.printf("không được phép cho vay");
    }
}
