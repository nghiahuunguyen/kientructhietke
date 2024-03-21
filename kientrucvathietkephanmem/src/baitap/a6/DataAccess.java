package baitap.a6;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess intance;
    private List<SanPham> list =new ArrayList<>();
    public static DataAccess getInstance(){
        if(intance==null){
            intance =new DataAccess();
        }
        return intance;
    }
    public  void add (SanPham s){
        list.add(s);
    }
    public List<SanPham> getList() {
        return list;
    }
}
