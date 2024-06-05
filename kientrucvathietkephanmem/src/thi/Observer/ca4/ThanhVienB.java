package thi.Observer.ca4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements TopicListener{
    List<TinTuc>list= new ArrayList<>();
    Topic topic;

    public ThanhVienB(Topic topic) {
        this.topic = topic;
        this.topic.dangky(this);
        this.list=this.topic.list;
    }

    @Override
    public void listen(TinTuc t) {
        System.out.println("Thành viên B");
        for (TinTuc l : list) {
            if (list.contains(t)){
                System.out.println(l.toString());
                return;
            }
        }
        list.add(t);
        for(TinTuc l : list){
            System.out.println(l.toString());
        }
    }
}
