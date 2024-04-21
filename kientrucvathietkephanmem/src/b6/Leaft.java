package b6;

public class Leaft extends Bnode{
    Bnode left;
    Bnode right;
    public Leaft(int value) {
        super(value);
    }

    @Override
    public void addL(Bnode n) {
        this.left=n;
    }

    @Override
    public void addR(Bnode n) {
        this.right=n;
    }

    @Override
    public void removeL(Bnode n) {

    }

    @Override
    public void removeR(Bnode n) {

    }

    @Override
    public String duyet() {
        StringBuilder builder = new StringBuilder();
        builder.append(value);

        return builder.toString();
    }
}
