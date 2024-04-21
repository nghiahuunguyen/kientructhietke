package ca5;

public class TaiKhoan implements taiKhoanATM {
    String tenTk;
    int sodu;
    ATM atm;

    public TaiKhoan(String tenTk, int sodu, ATM atm) {
        this.tenTk = tenTk;
        this.sodu = sodu;
        this.atm = atm;
    }

    public void duavaotheATM() {
        atm.nhanThe(this);
    }

    public void kiemtrasodu() {
        atm.traThe(this);
    }

    @Override
    public boolean kiemtrasodu(int soTien) {
        if(sodu - 50 > soTien)
            return true;
        return false;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong == true){
            System.out.println("Tài Khoản:" + tenTk);
            System.out.println("Số dư tài khoản:"+sodu);
            System.out.println("Số tiền rút: "+soTienRut);
            sodu = sodu = soTienRut;
            System.out.println("Số dư còn lại: "+sodu);
        }else{
            System.out.println("Tài Khoản:" + tenTk);
            System.out.println("Số dư tài khoản:"+sodu);
            System.out.println("Số tiền rút: "+soTienRut);
            System.out.println("Không đủ tiền để rút");
        }
    }
}