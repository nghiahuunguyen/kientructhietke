package baitap.ca1;

import java.util.List;

public class main {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream =new MyStream<>();
        DataAccess dataAccess=new DataAccess(stream);
        //MyClient client=new MyClient(stream);
        MyClientGrenric<List<MonHoc>> client =new MyClientGrenric<>(stream,monHocs -> {
           for(MonHoc m:monHocs)
               System.out.println(m.toString());
        });
        System.out.println("Lần 1");
        dataAccess.add(new MonHoc("001","LSD",3));
        System.out.println("Lần 2");
        dataAccess.add(new MonHoc("002","HDH",3));
        System.out.println("Lần 3");
        dataAccess.remove("002");
    }
}
