package baitap.cb5;

public class xeploaiyeu extends xeploai{
    public xeploaiyeu(String tenloai, double min) {
        super(tenloai, min);
    }

    @Override
    public xeploai xeploaiketiep(xeploai kt) {
        return null;
    }

    @Override
    public String sapxeploai(double diem) {
        return this.tenloai;
    }
}
