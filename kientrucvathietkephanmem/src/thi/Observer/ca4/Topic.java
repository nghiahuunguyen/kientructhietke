package thi.Observer.ca4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<TopicListen> listens;
    List<TinTuc> tt;

    public Topic(List<TinTuc>tt, List<TopicListen> listens) {
        this.tt = tt;
        this.listens = listens;
    }

    public void  dangky(TopicListen listen){
       listens.add(listen);
    }
    public void huydangky(TopicListen listen){
        listens.remove(listen);
    }
    public void themmoi(TinTuc t){
        // Thêm đối tượng TinTuc mới vào danh sách t
        tt.add(t);
        // Thông báo cho mỗi listener về TinTuc mới
        for (TopicListen listener : listens) {
            listener.listen(t);
        }
    }
    public void capnhat(TinTuc t){

    }
}
