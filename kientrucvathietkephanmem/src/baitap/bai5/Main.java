package baitap.bai5;

public class Main {
    public static void main(String[] args) {
        Context c =new Context();
        float tg1 = c.setTinh(new Cong()).tinh(3,5);
        float kq =c.setTinh(new Nhan()).tinh(tg1,7);
        System.out.println(kq);
    }
}
