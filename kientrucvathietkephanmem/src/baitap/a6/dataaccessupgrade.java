package baitap.a6;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class dataaccessupgrade {
    private static Dictionary<String, dataaccessupgrade> intance=new Hashtable<>();
    private List<SanPham> list =new ArrayList<>();
    public static dataaccessupgrade getInstance(String tag){
        if(intance.get(tag)==null){
            dataaccessupgrade d=new dataaccessupgrade();
            intance.put(tag,d);
        }
        return intance.get(tag);
    }
    public  void add (SanPham s){
        list.add(s);
    }
    public List<SanPham> getList() {
        return list;
    }
}
