package baitap.ca1;

import java.util.function.Consumer;

public class MyClientGrenric<T>implements MyStream.MyListener<T> {
    MyStream stream;
    Consumer<T>consumer;

    public MyClientGrenric(MyStream stream, Consumer<T> consumer) {
        this.stream = stream;
        this.consumer = consumer;
        this.stream.addListen( this);
    }

    @Override
    public void listen(T t) {
        consumer.accept(t);
    }
}
