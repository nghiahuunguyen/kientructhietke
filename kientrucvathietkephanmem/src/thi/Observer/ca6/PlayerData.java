package thi.Observer.ca6;

public class PlayerData {
    PlayerDataListener listener;
    int thoiGian, soLuotChoi, diemSo;

    public PlayerData(int soLuotChoi, int diemSo, int thoiGian) {
        this.soLuotChoi = soLuotChoi;
        this.diemSo = diemSo;
        this.thoiGian = thoiGian;
    }
    public interface PlayerDataListener{
        void listen(PlayerData data);
    }
    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        this.listener.listen(this);
    }

    public int getSoLuotChoi() {
        return soLuotChoi;
    }

    public void setSoLuotChoi(int soLuotChoi) {
        this.soLuotChoi = soLuotChoi;
        this.listener.listen(this);
    }

    public int getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
        this.listener.listen(this);
    }
    void DangKy(PlayerDataListener listener){
        this.listener = listener;
        listener.listen(this);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("Thời gian: ").append(thoiGian).append("\t")
                .append("Số lượt: ").append(soLuotChoi).append("\t")
                .append("Điểm số: ").append(diemSo);
        return b.toString();
    }
}
