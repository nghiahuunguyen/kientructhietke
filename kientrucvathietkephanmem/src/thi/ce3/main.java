package thi.ce3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Monhoc> list=new ArrayList<>(Arrays.asList(new Monhoc(3,"sot312","nhập môn"),
                new Monhoc(1,"sot564","the duc")));
        Iterator d=new Iterator();
        d.duyet(list.iterator());
    }
}
