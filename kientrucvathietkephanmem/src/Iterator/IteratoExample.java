package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratoExample {
    static void  duyetMonHocs(Iterator<MonHocK63>iterator){
        while (iterator.hasNext()){
            MonHocK63 mh=iterator.next();
            System.out.println(mh.toString());
        }

    }

    public static void main(String[] args) {
        List<MonHocK63> list=new ArrayList<>(Arrays.asList(new MonHocK63("Thể duc",1),
        new MonHocK63("Xác suất thông kê",3),
                new MonHocK63("LSD",3),
                new MonHocK63("Toán rr",3)));
        duyetMonHocs(list.iterator());
    }
}
