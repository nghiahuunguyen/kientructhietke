package Structural.Decorator.B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTu implements Tokenize{
    String s;

    public TachTu(String s) {
        this.s = s;
    }


    @Override
    public List<String> tokenize() {
        String[] totens = s.split(" ");
        //T...a đầu vào là mảng, có thể cung cấp từng phần tử của mảng hoặc cung cấp mảng
        ArrayList list = new ArrayList(Arrays.asList(totens));
        return list;
    }
}
