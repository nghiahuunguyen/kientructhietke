package baitap.cb5;

public class main {
    public static void main(String[] args) {
        xeploai xs= new xeploaikhac("Xuất sắc",9);
        xeploai gioi=new xeploaikhac("Gioi",8);
        xeploai kha=new xeploaikhac("Khá",7);
        xeploai tb=new xeploaikhac("Trung bình",5);
        xeploai yeu=new xeploaiyeu("Yếu",0);
        xs.xeploaiketiep(gioi)
                .xeploaiketiep(kha)
                .xeploaiketiep(tb)
                .xeploaiketiep(yeu);
        System.out.printf(xs.sapxeploai(6));

    }
}
