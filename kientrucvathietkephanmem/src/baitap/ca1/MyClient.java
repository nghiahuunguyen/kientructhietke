package baitap.ca1;

import java.util.List;

public class MyClient implements MyStream.MyListener<List<MonHoc>> {
    MyStream<List<MonHoc>> myStream;

    public MyClient(MyStream<List<MonHoc>> myStream) {
        this.myStream = myStream;
        myStream.addListen(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        System.out.println("Số môn học "+monHocs.size());
        for(MonHoc m:monHocs){
            System.out.println(m.toString());
        }
    }
}
