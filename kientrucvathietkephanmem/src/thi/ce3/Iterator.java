package thi.ce3;

public class Iterator {
    static void duyet(java.util.Iterator<Monhoc> iterator){
        while (iterator.hasNext()){
            Monhoc mh=iterator.next();
            System.out.println(mh);
        }
    }
}
