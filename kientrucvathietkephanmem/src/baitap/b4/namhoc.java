package baitap.b4;

import java.util.ArrayList;
import java.util.List;

public class namhoc extends Abstrac{
    int nam;

    public namhoc(String ten, int nam) {
        super(ten);
        this.nam = nam;
    }
    List<Abstrac> namhoclist =new ArrayList<>();
    @Override
    public void lietkemonhoc() {
        System.out.println("Năm học: "+nam);
        for(Abstrac nam:namhoclist)
            nam.lietkemonhoc();
    }

    @Override
    public int tongsotinchi() {
        int sumtinchi =0;
        for(Abstrac nam:namhoclist)
            sumtinchi+=nam.tongsotinchi();
        return sumtinchi;
    }

    @Override
    public double tonghocphi() {
        double sumhocphi=0;
        for(Abstrac nam:namhoclist)
            sumhocphi+=nam.tonghocphi();
        return sumhocphi;
    }

    @Override
    public void add(Abstrac monhoc) {
        namhoclist.add(monhoc);
    }

    @Override
    public void remove(Abstrac monhoc) {
        namhoclist.remove(monhoc);
    }
}
