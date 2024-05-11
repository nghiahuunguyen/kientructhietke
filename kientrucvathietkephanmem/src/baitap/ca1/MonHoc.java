package baitap.ca1;

public class MonHoc {
    String tenmh,maMH;
    int sotc;

    public MonHoc( String maMH, String tenmh,int sotc) {
        this.tenmh = tenmh;
        this.maMH = maMH;
        this.sotc = sotc;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "tenmh='" + tenmh + '\'' +
                ", maMH='" + maMH + '\'' +
                ", sotc=" + sotc +
                '}';
    }
}
