package f88;

public class nhanVien extends ChoVayF88{
    ChoVayF88 capCaoHon;
    public nhanVien(String ten, String chucVu,int hanMucXuLyVay) {
        super( ten, chucVu,hanMucXuLyVay);
    }

    @Override
    public ChoVayF88 capCaoHon(ChoVayF88 capCao) {
        capCaoHon=capCao;
        return capCao;
    }

    @Override
    public String xuLyVay(int soTienVay) {
        if(soTienVay<=hanMucXuLyVay){
            StringBuilder builder=new StringBuilder();
            builder.append(chucVu).append("").append(ten)
                    .append("duyet so tien vay ").append(soTienVay)
                    .append("nhớ tả lại đúng hạng");
            return builder.toString();

        }
        return capCaoHon.xuLyVay(soTienVay);
    }
}
