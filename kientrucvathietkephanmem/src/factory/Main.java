package factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore vnpizzaStrore =new VN_PizzaStore();
        Pizza p = vnpizzaStrore.order(PizzaType.HAI_SAN);
        System.out.println(p.toString());

       
    }
}
