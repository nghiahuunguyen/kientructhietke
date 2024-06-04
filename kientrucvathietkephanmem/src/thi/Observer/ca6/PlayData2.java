package thi.Observer.ca6;

public class PlayData2 {
    PlayDataListener2 listener2;
    int thoigian,soluotchoi,diemso;

    public PlayData2(int thoigian, int soluotchoi, int diemso) {
        this.thoigian = thoigian;
        this.soluotchoi = soluotchoi;
        this.diemso = diemso;
    }
    public void dangky1(PlayDataListener2 listener2){
        this.listener2=listener2;
        this.listener2.listen(this);
    }
    public void huydk(PlayDataListener2 listener2){
        this.listener2=null;
    }

    public void setThoigian(int thoigian) {
        this.thoigian = thoigian;
        this.listener2.listen(this);
    }

    public void setSoluotchoi(int soluotchoi) {
        this.soluotchoi = soluotchoi;
        this.listener2.listen(this);
    }

    public void setDiemso(int diemso) {
        this.diemso = diemso;
        this.listener2.listen(this);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("Thời gian: ").append(thoigian).append("\t")
                .append("Số lượt: ").append(soluotchoi).append("\t")
                .append("Điểm số: ").append(diemso);
        return b.toString();

    }
}
