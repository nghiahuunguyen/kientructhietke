package behavioral.template_method;

public class coffee extends caffeinebeverage{
    @Override
    void brew() {
        System.out.println("Cho bột coffee vào phin và cho thêm nước sôi vào");
    }

    @Override
    void addcondiemts() {
        System.out.println("cho them một ít sữa đặc");
    }
    public void preparRecipe(){
        super.prepareRecipe();
    }
}
