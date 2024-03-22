package baitap.b6;

public abstract class Bnode {
    int data;

    public Bnode(int data) {
        this.data = data;
    }
    public abstract void add(Bnode node);
    public abstract void remove(Bnode node);
    public abstract void duyet();
}
