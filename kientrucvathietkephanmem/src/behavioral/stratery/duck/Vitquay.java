package behavioral.stratery.duck;

public class Vitquay extends Duck{
    @Override
    public void display() {
        System.out.println("Tôi là vịt quay");
        performFly();
        performQuack();
        Swin();
    }
}
