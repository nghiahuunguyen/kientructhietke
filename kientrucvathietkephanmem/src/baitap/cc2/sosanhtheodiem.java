package baitap.cc2;

public class sosanhtheodiem implements Isosanh<sinhvien>{
    @Override
    public int sosanh(sinhvien t1, sinhvien t2) {
        if(t1.diemtb>t2.diemtb)
            return 1;
        if(t1.diemtb==t2.diemtb)
            return 0;
        return -1;
    }
}
