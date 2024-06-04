package CA6;

public class PlayerData {
    PlayerDataListener listener;
    int thoiGian, soLuotChoi, diemSo;
    public PlayerData(int thoiGian, int soLuotChoi, int diemSo) {
        this.thoiGian = thoiGian;
        this.soLuotChoi = soLuotChoi;
        this.diemSo = diemSo;
    }

    public interface PlayerDataListener{
        void listen(PlayerData data);
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        listener.listen(this);
    }

    public int getSoLuotChoi() {
        return soLuotChoi;
    }

    public void setSoLuotChoi(int soLuotChoi) {
        this.soLuotChoi = soLuotChoi;
        listener.listen(this);
    }

    public int getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
        listener.listen(this);
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
