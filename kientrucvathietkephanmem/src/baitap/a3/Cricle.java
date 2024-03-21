package baitap.a3;

public class Cricle extends shape{
    private static Cricle instance;

    public Cricle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    public static Cricle getInstance(){
        if(instance==null) instance=new Cricle(" but chi "," giay","khung go");
        return instance;
    }

    @Override
    String draw() {
        return "ve hinh tron voi"+brush+"tren "+paper+" khung "+frame;
    }
}
