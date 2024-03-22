package baitap.b6;

public class Leaft extends Bnode {
    public Leaft(int data) {
        super(data);
    }

    @Override
    public void add(Bnode node) {

    }

    @Override
    public void remove(Bnode node) {

    }

    @Override
    public void duyet() {
        System.out.println("Nút lá có giá trị: "+data);
    }
}
