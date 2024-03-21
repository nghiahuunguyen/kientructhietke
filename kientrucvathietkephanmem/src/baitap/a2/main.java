package baitap.a2;

public class main {
    public static void main(String[] args) {
        MyStringBuilder my=new MyStringBuilder.Bulider()
                .addString("hello")
                .addFloat(1.32f)
                .addBool(true)
                .bulider();
        System.out.println(my.toString() );
    }
}
