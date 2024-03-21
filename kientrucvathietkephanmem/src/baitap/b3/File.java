package baitap.b3;

public class File extends AbstracFile{
    public File(String tenhumuc, String ngaytao) {
        super(tenhumuc, ngaytao);
    }

    @Override
    public void add(AbstracFile file) {

    }

    @Override
    public void remove(AbstracFile file) {

    }

    @Override
    public String getStringTreeFolder() {
        return this.tenhumuc;
    }
}
