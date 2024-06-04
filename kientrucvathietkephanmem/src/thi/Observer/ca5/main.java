package thi.Observer.ca5;

public class main {
    public static void main(String[] args) {
        ATM a1= new ATM();
        TaiKhoan b1=new TaiKhoan(a1,2000);
        b1.duaTheVaoATM();
        a1.rutTien(1000);

    }
}
