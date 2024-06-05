package baitap.cb3;

public class Main {
    public static void main(String[] args) {
        TienDienBacThang bac1=new BacThapNhat("bac 1",0,50,1.728f);
        TienDienBacThang bac2=new BacThapNhat("bac 2",51,100,1.786f);
        TienDienBacThang bac3=new BacThapNhat("bac 3",101,200,2.074f);
        TienDienBacThang bac4=new BacThapNhat("bac 4",201,300,2.612f);
        TienDienBacThang bac5=new BacThapNhat("bac 5",301,400,2.919f);
        TienDienBacThang bac6 = new BacCaoNhat("bac 6", 401, Integer.MAX_VALUE, 3.015f);
        bac1.TienDienBacThangketiep(bac2)
                .TienDienBacThangketiep(bac3)
                .TienDienBacThangketiep(bac4)
                .TienDienBacThangketiep(bac5)
                .TienDienBacThangketiep(bac6);
        float t=bac1.xuly(50.0f);
        System.out.println(t);
    }
}
