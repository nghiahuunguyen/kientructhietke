package behavioral.Observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<Tintuc> list = new ArrayList<>();
    List<TopicListener> listeners = new ArrayList<>();


    void dangky(TopicListener listener){
        listeners.add(listener);
    }
    void huyDangKy(TopicListener listener){
        listeners.remove(listener);
    }
    void themMoi(Tintuc t){
        list.add(t);
        for(TopicListener listener:listeners)
            listener.listen(t);
    }
    void capNhat(Tintuc t){
        for(int i=0;i< list.size();i++){
            if(list.get(i).getID()==t.getID()){
                list.set(i,t);
                for(TopicListener listener:listeners)
                    listener.listen(t);
                return;
            }
        }
    }

    public interface TopicListener{
        void listen(Tintuc t);
    }
}
