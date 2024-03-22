package baitap.b4;

import java.util.ArrayList;
import java.util.List;

public class khoahoc extends Abstrac{
    List<Abstrac> khoahoclist=new ArrayList<>();

    public khoahoc(String ten) {
        super(ten);
    }

    @Override
    public void lietkemonhoc() {
        for (Abstrac khoahoc:khoahoclist){
            khoahoc.lietkemonhoc();
        }
    }

    @Override
    public int tongsotinchi() {
        int tongtinchi=0;
        for(Abstrac khoahoc:khoahoclist)
            tongtinchi+=khoahoc.tongsotinchi();
        return tongtinchi;
    }

    @Override
    public double tonghocphi() {
        double tonghocphi=0;
        for(Abstrac khoahoc:khoahoclist)
            tonghocphi+=khoahoc.tonghocphi();
        return tonghocphi;
    }

    @Override
    public void add(Abstrac monhoc) {
        khoahoclist.add(monhoc);
    }

    @Override
    public void remove(Abstrac monhoc) {
        khoahoclist.remove(monhoc);
    }
}
