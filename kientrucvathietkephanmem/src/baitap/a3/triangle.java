package baitap.a3;

public class triangle extends shape{
    private static triangle instance;

    public triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    public static triangle getInstance(){
        if(instance==null) instance=new triangle(" but chi "," giay","khung go");
        return instance;
    }

    @Override
    String draw() {
        return "ve tam giac voi"+brush+"tren "+paper+" khung "+frame;
    }
}
