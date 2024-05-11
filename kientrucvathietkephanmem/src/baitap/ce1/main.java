package baitap.ce1;

public class main {
    public static void main(String[] args) {
        ArrayCollection arry=new ArrayCollection();
        Iterator inter= arry.createIterator();
        while(!inter.isDone()){
            System.out.println(inter.next());
        }

    }
}
