package baitap.ce1;

import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayInterator implements Iterator {

    ArrayCollection collection;
    int index=-1;
    protected ArrayInterator(ArrayCollection array){this.collection=array;}

    @Override
    public Object frist() {
       if(collection.count()>0){
           index=0;
           return collection.getItem(index);
       }
       return null;
    }

    @Override
    public Object next() {
        if(!isDone())
            return  collection.getItem(++index);
        return null;
    }

    @Override
    public Object current() {
        if(index>=0)
            return collection.getItem(index);
        return null;
    }

    @Override
    public boolean isDone() {
        return (index==collection.count()-1);
    }
}
