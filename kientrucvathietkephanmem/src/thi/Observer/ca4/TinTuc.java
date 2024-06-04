package thi.Observer.ca4;

public class TinTuc {
    int Id;
    String Noidung;

    public TinTuc(String noidung, int id) {
        Noidung = noidung;
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNoidung() {
        return Noidung;
    }

    public void setNoidung(String noidung) {
        Noidung = noidung;
    }
}
