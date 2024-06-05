package thi.ce3;

public class Monhoc {
    int sotc;
    String mahp,tenhp;

    public Monhoc(int sotc, String mahp, String tenhp) {
        this.sotc = sotc;
        this.mahp = mahp;
        this.tenhp = tenhp;
    }

    public String getMahp() {
        return mahp;
    }

    public void setMahp(String mahp) {
        this.mahp = mahp;
    }

    public int getSotc() {
        return sotc;
    }

    public void setSotc(int sotc) {
        this.sotc = sotc;
    }

    public String getTenhp() {
        return tenhp;
    }

    public void setTenhp(String tenhp) {
        this.tenhp = tenhp;
    }

    @Override
    public String toString() {
        return "mã hp"+mahp+"tên hp"+tenhp+ "số tc "+sotc;
    }
}
