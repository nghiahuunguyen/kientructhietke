package thi.ce1;

public class ArrayCollection extends Collection {
    int [] arr={1,2,3};
    public int getItem(int i){
        return arr[i];
    }
    public int count(){
        return arr.length;
    }

    @Override
    MyIterator craateIterator() {
        return new ArrayIterator(this);
    }
}
