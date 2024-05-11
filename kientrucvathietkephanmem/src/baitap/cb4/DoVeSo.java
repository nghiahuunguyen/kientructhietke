package baitap.cb4;

import java.util.List;

public abstract class DoVeSo {
    String tenGiai;
    List<String> soTrungThuongs;

    public DoVeSo(String tenGiai, List<String> soTrungThuongs) {
        this.tenGiai = tenGiai;
        this.soTrungThuongs = soTrungThuongs;
    }

    public abstract DoVeSo giaiKeTiep(DoVeSo giaiKT);
    public abstract void doveSo(String veso);
}