package behavioral.Observer.CA4;

public class Tintuc {
    int ID;
    String noidung;

    public Tintuc(int ID, String noidung) {
        this.ID = ID;
        this.noidung = noidung;
    }

    @Override
    public String toString() {
        StringBuilder  builder = new StringBuilder()
                .append(ID).append(". ").append(noidung);
        return builder.toString();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
