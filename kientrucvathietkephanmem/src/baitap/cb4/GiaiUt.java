package baitap.cb4;

import java.util.List;

public class GiaiUt extends DoVeSo{
    public GiaiUt(String tenGiai, List<String> soTrungThuongs) {
        super(tenGiai, soTrungThuongs);
    }

    @Override
    public DoVeSo giaiKeTiep(DoVeSo giaiKT) {
        return null;
    }

    @Override
    public void doveSo(String veso) {
        for (String s : soTrungThuongs) {
            if (veso.endsWith(s)) {
                System.out.println("Đã Trúng Giải "+tenGiai);
                return;
            }
        }
        System.out.println("Chúc bạn may mắn");
    }
}
