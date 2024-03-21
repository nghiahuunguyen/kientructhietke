package baitap.a1;

public class Main {
    public static void main(String[] args) {
        hoadonhedar hoadonhedar = new hoadonhedar("MHD001", "2003-03-09", "nghia");
        CTHD cthd1 = new CTHD("Tivi", 2, 10.5, 0.1);
        CTHD cthd2 = new CTHD("Laptop", 3, 8.75, 0.05);
        hoadon hoadon = new hoadon.Builder()
                .setHoadonhedar(hoadonhedar)
                .addCTHD(cthd1)
                .addCTHD(cthd2)
                .build();

        System.out.println(hoadon);
    }
}