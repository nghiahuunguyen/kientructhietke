package b6;

public abstract class Bnode {
    int value;
    String p="";

    public Bnode(int value) {
        this.value = value;
    }
    public abstract void addL(Bnode n);
    public abstract void addR(Bnode n);
    public abstract void removeL(Bnode n);
    public abstract void removeR(Bnode n);
    public abstract String duyet();
}
