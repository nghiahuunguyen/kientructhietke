package baitap.cb5;

public abstract class xeploai {
    String tenloai;
    double min;

    public xeploai(String tenloai, double min) {
        this.tenloai = tenloai;
        this.min = min;
    }

    public abstract xeploai xeploaiketiep(xeploai kt);
    public abstract String sapxeploai(double diem);
}