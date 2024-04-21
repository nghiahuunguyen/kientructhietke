package b4;

public class monhoc extends kehoachhoctap{
    int sotc;
    int hocphitc;

    public monhoc(String ten, int sotc, int hocphitc) {
        super(ten);
        this.sotc = sotc;
        this.hocphitc = hocphitc;
    }

    @Override
    public int sotc() {
        return sotc;
    }

    @Override
    public int hocphi() {
        return hocphitc;
    }

    @Override
    public String thongtin() {
        StringBuilder builder=new StringBuilder();
        builder.append("môn học: ").append(ten)
                .append("\tsố tc:  ").append(sotc)
                .append("\thọc phí tc: ").append(hocphitc);
        return builder.toString();
    }

    @Override
    public void add(kehoachhoctap k) {

    }

    @Override
    public void remove(kehoachhoctap k) {

    }
}
