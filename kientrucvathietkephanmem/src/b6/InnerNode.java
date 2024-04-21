package b6;

public class InnerNode extends Bnode{
    Bnode left;
    Bnode right;

    public InnerNode(int value) {
        super(value);
    }

    @Override
    public void addL(Bnode n) {
        this.left = n;
    }

    @Override
    public void addR(Bnode n) {
        this.right = n;
    }

    @Override
    public void removeL(Bnode n) {
    }

    @Override
    public void removeR(Bnode n) {

    }

    @Override
    public String duyet() {
        StringBuilder b=new StringBuilder();
        b.append(value);
        if(left!=null){
            left.p=this.p+"\t";
            b.append("\n\t").append(p).append(left.duyet());
        }if(right!=null){
            right.p=this.p+"\t";
            b.append("\n\t").append(p).append(right.duyet());
        }


        return b.toString();
    }
}
