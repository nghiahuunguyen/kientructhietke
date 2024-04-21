package ca5;

public class ATM {
    taiKhoanATM theATM;
    void nhanThe(taiKhoanATM atm){
        theATM=atm;
    }
    void traThe(taiKhoanATM atm){
        theATM=atm;
    }
    public void rutTien(int soTien){
        if (theATM!=null){
            if(theATM.kiemtrasodu(soTien)==true){
                theATM.nhanThongBao(soTien,true);
            }
            else {
                theATM.nhanThongBao(soTien,false);
            }
        }
        else {
            System.out.println("ko có tiền trong thẻ");
        }
    }
}
