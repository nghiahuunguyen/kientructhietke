package thi.ce1;

public class ArrayIterator implements MyIterator{
    ArrayCollection collection;
    int index=-1;

    public ArrayIterator(ArrayCollection collection) {
        this.collection = collection;
    }

    @Override
    public Object first() {
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
