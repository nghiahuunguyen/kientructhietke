package f88;

public class main {
    public static void main(String[] args) {
        ChoVayF88 baove=new nhanVien("nghia","bao ve",1000000);
        ChoVayF88 nv =new nhanVien("nghia1","nhanvien",2000000);
        ChoVayF88 giamdoc =new ChuTich("nghia2","nhanvien",3000000);
        baove.capCaoHon(nv)
                .capCaoHon(giamdoc);
        System.out.println(baove.xuLyVay(1500000));
    }
}
