package baitap.a3;


public class main {
    public static void main(String[] args) {
        shape shape=shapefactory.createshape(shapetype.Rectangle);
        shape s1=shapefactory.createshape(shapetype.Cricle);
        System.out.println(shape.draw());
        System.out.println(s1.draw());
    }
}
