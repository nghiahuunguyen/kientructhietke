package thi.Observer.ca4;

public class TinTuc {
    int id;
    String noidung;

    public TinTuc(int id, String noidung) {
        this.id = id;
        this.noidung = noidung;
    }

    @Override
    public String toString() {
        StringBuilder  builder = new StringBuilder()
                .append(id).append(". ").append(noidung);
        return builder.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
