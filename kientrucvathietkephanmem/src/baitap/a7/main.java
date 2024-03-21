package baitap.a7;

public class main {
    public static void main(String[] args) {
        maytinh mt=new maytinh.Builder()
                .setCPU("i7")
                .setRam("16GB")
                        .setSCREEN("27inck 144hz")
                                .setHardDisk("1TB SSD")
                                        .build();
        System.out.println(mt);
    }
}
