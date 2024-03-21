package baitap.b3;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstracFile{
    List<AbstracFile> children = new ArrayList<>();
    public Folder(String tenhumuc, String ngaytao) {
        super(tenhumuc, ngaytao);
    }

    @Override
    public void add(AbstracFile file) {
        children.add(file);
        file.duongdan=this.duongdan+"\\"+file.duongdan;
    }

    @Override
    public void remove(AbstracFile file) {
        children.remove(file);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder=new StringBuilder();
        builder.append(this.tenhumuc).append("\n");
        //ghép cây con vào
        for(var f:children)
            builder.append("\n").append(f.getStringTreeFolder());
        return builder.toString();
    }
}
