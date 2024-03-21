package baitap.a6;

public class UT1 {
    public void add (SanPham s){
        var d = DataAccess.getInstance();
        d.add(s);
    }
    public void add(SanPham s,String tag){
        //lay 1 đoi tuong dataaccessupgrade
        var da=dataaccessupgrade.getInstance(tag);
        //gọi phương thúc add tên đối tượng vừa lấy
        da.add(s);
    }
    public void inds(String tag) {
        dataaccessupgrade daUpgrade = dataaccessupgrade.getInstance(tag);
        System.out.println("Danh sách sản phẩm với tag '" + tag + "':");
        for (SanPham sanPham : daUpgrade.getList()) {
            System.out.println(sanPham.toString());
        }
    }

}
