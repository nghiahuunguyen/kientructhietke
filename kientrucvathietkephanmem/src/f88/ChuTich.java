package f88;

public class ChuTich extends ChoVayF88 {
    public ChuTich( String ten, String chucVu,int hanMucXuLyVay) {
        super( ten, chucVu,hanMucXuLyVay);
    }

    @Override
    public ChoVayF88 capCaoHon(ChoVayF88 capCao) {
        return null;
    }

    @Override
    public String xuLyVay(int soTienVay) {
        if(soTienVay<=hanMucXuLyVay){
            StringBuilder builder=new StringBuilder();
            builder.append(chucVu ).append("").append(ten )
                    .append("duyet so tien vay ").append(soTienVay)
                    .append(" nhớ tả lại đúng hạng");
            return builder.toString();

        }
        return "Ra ngân hàng vay";
    }
}
