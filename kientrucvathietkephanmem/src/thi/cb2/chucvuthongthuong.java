package thi.cb2;

public class chucvuthongthuong extends Vay{
    Vay ketiep;
    public chucvuthongthuong(String tennguoiduyet, String chucvu, int sotien) {
        super(tennguoiduyet, chucvu, sotien);
    }

    @Override
    Vay vayketiep(Vay kiep) {
        ketiep=kiep;
        return ketiep;
    }

    @Override
    void xuly(int sotienvay) {
        if(sotienvay<=sotien){
            System.out.printf("Tên người duyệt "+tennguoiduyet+" Chức vụ "+chucvu+" Số tiền vay "+sotienvay);
            return;
        }
        ketiep.xuly(sotienvay);
    }
}
