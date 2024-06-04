package thi.Observer.ca5;

public class ATM {
    TaiKhoanATM theatm;
    public void nhanthe(TaiKhoanATM theatm){
        this.theatm = theatm;
    }
    public void TraThe(){
        this.theatm=null;
    }
    public void rutTien(int sotienrut){
        if(theatm!=null){
            if(theatm.kiemTraSoDu(sotienrut)){
                theatm.nhanThongBao(sotienrut,true);
            }
            else {
                theatm.nhanThongBao(sotienrut,false);
            }
        }
    }

}
