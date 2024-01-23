package bt_java.Lab1;

public class Sinhvien {
    String ten, diachi;
    int tuoi, tongsogiolam;
    double tienluong;

    public Sinhvien() {
    }

    public Sinhvien(String ten, String diachi, int tuoi, int tongsogiolam, double tienluong) {
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.tongsogiolam = tongsogiolam;
        this.tienluong = tienluong;
    }

    @Override
    public String toString() {
        return "Tên: " + ten + "\n" +
                "Địa chỉ: " + diachi + "\n" +
                "Tuổi: " + tuoi + "\n" +
                "Tổng số giờ làm: " + tongsogiolam + "\n" +
                "Tiền lương: " + tienluong + "\n";
    }

    double tinhluong() {
        if (tongsogiolam >= 200)
            return tienluong * 0.2;
        if (tongsogiolam >= 100)
            return tienluong * 0.1;
        return 0;
    }

    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getTongsogiolam() {
        return tongsogiolam;
    }

    public double getTienluong() {
        return tinhluong();
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setTongsogiolam(int tongsogiolam) {
        this.tongsogiolam = tongsogiolam;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }
    public String getThongTin() {
        return "Tên: " + ten +
                "\nTuổi: " + tuoi +
                "\nĐịa chỉ: " + diachi +
                "\nTiền lương: " + tinhluong() +
                "\nTổng số giờ làm: " + tongsogiolam;
    }

}