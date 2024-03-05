package behavioral.template_method;

public abstract class caffeinebeverage {
    abstract void brew();
    abstract void addcondiemts();
    void boilWater(){
        System.out.println("Đun sôi nước đến 100 đọ c");
    }
    private void pourIncup(){
        System.out.println("Rớt thức uống ra cóc");
    }
    public void prepareRecipe(){
        boilWater();
        brew();
        pourIncup();
        addcondiemts();

    }
}
