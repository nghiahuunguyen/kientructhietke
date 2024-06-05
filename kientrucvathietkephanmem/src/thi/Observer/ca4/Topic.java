package thi.Observer.ca4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<TinTuc>list =new ArrayList<>();
    List<TopicListener>listeners=new ArrayList<>();
    void dangky(TopicListener listen){
        listeners.add(listen);
    }
    void  themmoi(TinTuc t){
        list.add(t);
        for( TopicListener s:listeners){
            s.listen(t);
        }
    }
    void capnhat(TinTuc t){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==t.getId()){
                list.set(i,t);
                for( TopicListener s:listeners){
                    s.listen(t);
                }
            }
        }
    }
}
