package behavioral.stratery.duck;

public abstract class Duck {
    IflyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    void  performQuack(){
        System.out.println(quackBehavior.quack());
    }
    void performFly(){
        System.out.println(flyBehavior.fly());
    }
    void Swin(){
        System.out.println("Vịt quay");
    }
    public void setFlyBehavior(IflyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public  abstract  void display();
}
