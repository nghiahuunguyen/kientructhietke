package baitap.b6;

import java.util.ArrayList;
import java.util.List;

public class InnerBnode extends Bnode{
    public InnerBnode(int data) {
        super(data);
    }
   List<Bnode> bnodeList=new ArrayList<>();

    @Override
    public void add(Bnode node) {
        bnodeList.add(node);
    }

    @Override
    public void remove(Bnode node) {
        bnodeList.remove(node);
    }

    @Override
    public void duyet() {
        System.out.println("Nút composite có giá trị là: "+ data);
        for (Bnode b:bnodeList)
            b.duyet();

    }
}
