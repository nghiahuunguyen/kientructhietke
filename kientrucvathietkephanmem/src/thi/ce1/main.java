package thi.ce1;



public class main {
    public static void main(String[] args) {
        ArrayCollection arry=new ArrayCollection();
        MyIterator iterator =arry.craateIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
