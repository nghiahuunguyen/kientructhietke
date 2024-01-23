package behavioral.stratery.duck;

public class MainDuck {
    public static void main(String[] args) {
        Duck duck=new Vitquay();
        duck.setFlyBehavior(new Baytrenlothan());
        duck.setQuackBehavior(new Vitquaykeu());
        duck.display();
    }
}
