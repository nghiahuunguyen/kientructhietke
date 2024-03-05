package baitap.CD3;

import java.util.List;

public abstract class SortCollection<T> {
    public abstract int compare(T t1,T t2);
    public void sort(List<T> list){
        for (int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(compare(list.get(i), list.get(j))>0){
                    T temp= list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}
