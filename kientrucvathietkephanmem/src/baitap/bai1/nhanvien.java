package baitap.bai1;

public class nhanvien {
    String ten;
    int tuoi;
    String diachi;
    double tienluong;
    int tongsogiolam;

    public int getTongsogiolam() {
        return tongsogiolam;
    }

    public void setTongsogiolam(int tongsogiolam) {
        this.tongsogiolam = tongsogiolam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    @Override
    public String toString() {
        return "Tên: " + ten + "\n" +
                "Địa chỉ: " + diachi + "\n" +
                "Tuổi: " + tuoi + "\n" +
                "Tổng số giờ làm: " + tongsogiolam + "\n" +
                "Tiền lương: " + tinhluong() + "\n";
    }
    double tinhluong() {
        if (tongsogiolam >= 200)
            return tienluong * 0.2;
        if (tongsogiolam >= 100)
            return tienluong * 0.1;
        return 0;
    }

    public nhanvien(String ten, int tuoi, String diachi, double tienluong,int tongsogiolam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.tongsogiolam=tongsogiolam;
    }
}
