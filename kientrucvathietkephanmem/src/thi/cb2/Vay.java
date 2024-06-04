package thi.cb2;

public abstract class Vay {
    String tennguoiduyet,chucvu;
    int sotien;

    public Vay(String tennguoiduyet, String chucvu, int sotien) {
        this.tennguoiduyet = tennguoiduyet;
        this.chucvu = chucvu;
        this.sotien = sotien;
    }
    abstract Vay vayketiep(Vay kiep);
    abstract void xuly(int sotienvay);
}
