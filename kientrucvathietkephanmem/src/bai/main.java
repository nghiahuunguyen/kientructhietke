package bai;

public class main {
    public static void main(String[] args) {
        Tigia t=new TigiaUSD();
        NhaDauTuA a= new NhaDauTuA(t);
        NhaDauTuB b=new NhaDauTuB(t);
        a.dangky();b.dangky();
        System.out.println("thông báo lần 1");
        t.notify(-1);
        a.huydangky();
        System.out.println("thông báo lần 2");
        t.notify(-1);
    }
}
