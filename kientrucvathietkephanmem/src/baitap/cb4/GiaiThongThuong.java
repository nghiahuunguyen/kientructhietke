package baitap.cb4;

import java.util.List;

public class GiaiThongThuong extends DoVeSo {
    DoVeSo kettiep;
    public GiaiThongThuong(String tenGiai, List<String> soTrungThuongs) {
        super(tenGiai, soTrungThuongs);
    }

    @Override
    public DoVeSo giaiKeTiep(DoVeSo giaiKT) {
        kettiep=giaiKT;
        return giaiKT;
    }

    @Override
    public void doveSo(String veso) {
        for (String s : soTrungThuongs) {
            if (veso.endsWith(s)) {
                System.out.println("Đã Trúng Giải "+tenGiai);
                return;
            }
        }
        kettiep.doveSo(veso);
    }
}