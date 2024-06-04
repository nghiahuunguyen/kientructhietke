package thi.Observer.ca5;

public class TaiKhoan implements  TaiKhoanATM{
    int sodu;
    ATM atm;

    public TaiKhoan(ATM atm, int sodu) {
        this.atm = atm;
        this.sodu = sodu;
    }
    public void duaTheVaoATM(){
        atm.nhanthe(this);
    }

    public void  rutTheKhoiATM(){
        atm.TraThe();
    }

    @Override
    public boolean kiemTraSoDu(int soTien) {
        if(soTien<=sodu) return true;
        return false;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong){
            sodu=sodu-soTienRut;
            System.out.println("Bạn đã rút " + soTienRut + " thành công\nSố dư tài khoản hiện tại: " + sodu);
        }
        else {
            System.out.println("Số dư tài khoản hiện tại không đủ\nSố dư tài khoản hiện tại: " + sodu);
        }

    }
}
