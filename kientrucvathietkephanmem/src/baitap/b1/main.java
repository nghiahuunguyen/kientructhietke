package baitap.b1;

public class main {
    public static void main(String[] args) {
        bieuthuc b =new bieuthucdongian(6);
        b=new cong(b,9);
        System.out.println(b.bieuthuc()+"="+b.giatri());
    }
}
