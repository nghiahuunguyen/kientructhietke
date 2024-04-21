package ca5;

public class main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk = new TaiKhoan("gh",1000,atm);
        System.out.println("Lần 1");
        atm.rutTien(500);
        System.out.println("Lần 2");
        tk.duavaotheATM();
        atm.rutTien(500);
        System.out.println("lần 3");
        atm.rutTien(600);
    }
}
