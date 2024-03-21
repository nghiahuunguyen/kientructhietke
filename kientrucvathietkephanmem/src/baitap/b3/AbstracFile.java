package baitap.b3;

public abstract class AbstracFile {
    String tenhumuc,ngaytao;
    String duongdan;

    public abstract void add(AbstracFile file);
    public abstract void remove(AbstracFile file);
    public abstract String  getStringTreeFolder();

    public AbstracFile(String tenhumuc,String ngaytao) {
        this.tenhumuc = tenhumuc;
        this.ngaytao=ngaytao;
        this.duongdan=tenhumuc;
    }

    public String getPath(){
        return duongdan;
    }
}
