package baitap.b4;
import java.util.ArrayList;
import java.util.List;
public class kyhoc extends Abstrac {
    List<Abstrac> kyhoclist = new ArrayList<>();

    public kyhoc(String ten) {
        super(ten);
    }

    @Override
    public void lietkemonhoc() {
        System.out.println("Các kỳ học: "+ten);
        for(Abstrac kyhoc : kyhoclist)
            kyhoc.lietkemonhoc();
    }

    @Override
    public int tongsotinchi() {
        int sumtinchi =0;
        for(Abstrac kyhoc:kyhoclist)
            sumtinchi+=kyhoc.tongsotinchi();
        return sumtinchi;
    }

    @Override
    public double tonghocphi() {
        double sumhocphi=0;
        for(Abstrac kyhoc:kyhoclist)
            sumhocphi+=kyhoc.tonghocphi();
        return sumhocphi;
    }

    @Override
    public void add(Abstrac monhoc) {
        kyhoclist.add(monhoc);
    }

    @Override
    public void remove(Abstrac monhoc) {
        kyhoclist.remove(monhoc);
    }
}
