package baitap.ce1;

public class ArrayCollection extends  Collection{
    private  int[] arr={1,2,3};
    public  int getItem(int i){
        return arr[i];
    }
    public int count(){
        return arr.length;
    }

    @Override
    Iterator createIterator() {
        return new ArrayInterator(this);
    }
}
