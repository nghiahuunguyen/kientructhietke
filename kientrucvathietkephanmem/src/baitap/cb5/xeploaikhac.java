package baitap.cb5;

public class xeploaikhac extends xeploai {
    xeploai loai;

    public xeploaikhac(String tenloai, double min) {
        super(tenloai, min);
    }

    @Override
    public xeploai xeploaiketiep(xeploai kt) {
        this.loai = kt;
        return this;
    }

    @Override
    public String sapxeploai(double diem) {
        if (diem >= this.min) {
            return this.tenloai;
        } else {
            return loai.sapxeploai(diem);
        }
    }
}