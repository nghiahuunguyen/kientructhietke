package baitap.cc2;

import baitap.cc2.sinhvien;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    Isosanh sosanh;
    List<sinhvien> list = new ArrayList<>();
    public  QLSV setsosanh(Isosanh sosanh){
        this.sosanh=sosanh;
        return this;
    }
    public void them(sinhvien s){
        list.add(s);
    }
    public void sapxep(){
        for(int i=0;i<list.size()-1;i++)
            for (int j=i+1;j<list.size();j++)
                //neu phan tu i lon hon phan tu j
                if(sosanh.sosanh(list.get(i),list.get(j))>0){
                    //chuyen j về i
                    sinhvien s  = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,s);
                }
    }
    public void sapxep2(){
        list.sort(((o1, o2) -> sosanh.sosanh(o1,o2)));
    }
    public void inDS(){
        for(sinhvien s:list){
            System.out.println(s.toString());
        }
    }
}
