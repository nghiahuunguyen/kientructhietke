package baitap.ca1;

import java.util.ArrayList;
import java.util.List;


public class MyStream<T> {
    List<MyListener> listeners = new ArrayList<>();

    public void addListen(MyListener listener) {
        listeners.add(listener);
    }
    public void addEvent(T t){
        for (MyListener listener:listeners)
            listener.listen(t);
    }
    public static interface MyListener<T>{
        void listen(T t);
    }
}