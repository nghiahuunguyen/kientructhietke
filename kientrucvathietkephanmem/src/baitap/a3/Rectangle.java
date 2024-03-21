package baitap.a3;

public class Rectangle extends shape{
    private  static Rectangle instance;

    public Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    public static Rectangle getInstance(){
        if(instance==null) instance=new Rectangle(" but chi "," giay","khung go");
        return instance;
    }
    @Override
    String draw() {
        return "ve hcn voi"+brush+"tren "+paper+" khung "+frame;
    }
}
