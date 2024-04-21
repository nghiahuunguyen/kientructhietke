package baitap.cb3;

public class Main {
    public static void main(String[] args) {
        TienDienBacThang bacCaoNhat = new BacCaoNhat("Bậc cao nhất", Integer.MAX_VALUE, 4010, 3151);
        TienDienBacThang bac5 = new BacThapNhat("Bậc 5", 4000, 3010, 3050, bacCaoNhat);
        TienDienBacThang bac4 = new BacThapNhat("Bậc 4", 3000, 2010, 2729, bac5);
        TienDienBacThang bac3 = new BacThapNhat("Bậc 3", 2000, 1010, 2167, bac4);
        TienDienBacThang bac2 = new BacThapNhat("Bậc 2", 1000, 510, 1866, bac3);
        TienDienBacThang bac1 = new BacThapNhat("Bậc 1", 500, 0, 1806, bac2);
        int soKW1 = 1000;
        int soKW2 = 2500;
        int soKW3 = 5000;

        int tienDien1 = bac1.tinhTienDien(soKW1);
        int tienDien2 = bac1.tinhTienDien(soKW2);
        int tienDien3 = bac1.tinhTienDien(soKW3);

        // Hiển thị kết quả
        System.out.println("Tiền điện (" + soKW1 + " kWh): " + tienDien1);
        System.out.println("Tiền điện (" + soKW2 + " kWh): " + tienDien2);
        System.out.println("Tiền điện (" + soKW3 + " kWh): " + tienDien3);
    }
}
