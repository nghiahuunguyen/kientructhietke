package b4;

import java.util.ArrayList;
import java.util.List;

public class kehoachchung extends kehoachhoctap {
    public kehoachchung(String ten) {
        super(ten);
    }
    List<kehoachhoctap> list=new ArrayList<>();
    @Override
    public int sotc() {
        int t=0;
        for(kehoachhoctap k:list)
            t=t+k.sotc();
        return t;
    }

    @Override
    public int hocphi() {
        int s=0;
        for(kehoachhoctap k:list)
            s=s+k.hocphi()*k.sotc();
        return s;
    }

    @Override
    public String thongtin() {
        StringBuilder builder=new StringBuilder();
        builder.append(ten)
                .append("\tsố tc: ").append(sotc())
                .append("\thọc phí: ").append(hocphi());
        for(kehoachhoctap k:list){
            k.p=this.p+"\t";
            builder.append("\n").append(k.p)
                    .append(k.thongtin());
            k.p="";
        }
        return builder.toString();
    }

    @Override
    public void add(kehoachhoctap k) {
        list.add(k);
    }

    @Override
    public void remove(kehoachhoctap k) {
        list.remove(k);
    }
}
