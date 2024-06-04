package behavioral.Observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements Topic.TopicListener{
    List<Tintuc> list = new ArrayList<>();
    Topic topic;

    public ThanhVienB(Topic topic) {
        this.topic = topic;
        this.topic.dangky(this);
        this.list=this.topic.list;
    }


    @Override
    public void listen(Tintuc t) {
         System.out.println("Thành viên B");
            for (Tintuc l : list) {
                if (list.contains(t)){
                    System.out.println(l.toString());
                return;
                }
            }
        list.add(t);
        for(Tintuc l : list){
            System.out.println(l.toString());
        }
    }

}
