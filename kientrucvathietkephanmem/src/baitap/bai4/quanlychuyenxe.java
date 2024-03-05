package baitap.bai4;

import java.util.ArrayList;
import java.util.List;

public class quanlychuyenxe {
    List<Chuyenxe> list = new ArrayList<>();

    public void them(Chuyenxe c){
        //ktra neu co chuyen xe da co trong ds thi dung
        for(Chuyenxe cx :list){
        if(cx.getMasochuyen().equals(c.getMasochuyen()))
            return;
        //them chuyen xe chua co trong ds

        }
        list.add(c);
    }
    public  void inDSCX(){
        for(Chuyenxe cx: list){
            System.out.println(cx.toString());
        }
    }

    public  float doanhthuxengoaithanh(){
        float dt=0;
        for(Chuyenxe c:list){
            if(c instanceof chuyenxengoaithanh)
                dt+= c.getDoanhthu();

        }
        return dt;
    }
    public  float doanhthunoithanh(){
        float dt=0;
        for(Chuyenxe c:list){
            if(c instanceof chuyenxenoithanh)
                dt+=c.getDoanhthu();
        }
        return dt;
    }
    public  float tongdoanhthu(){
        float dt=0;
        for(Chuyenxe c:list){
                dt+=c.getDoanhthu();
        }
        return dt;
    }

}
