package baitap.b3;

public class main {
    public static void main(String[] args) {
        AbstracFile data= new Folder("Data","3/1/2003");
        AbstracFile tailieu=new Folder("tailieu","1/1/2024");
        AbstracFile laptrinhjava=new Folder("laptrinhjava","4/1/2024");
        AbstracFile laptrinhdidong=new Folder("Laptrinhdidong","5/1/2024");
        data.add(tailieu);
        tailieu.add(laptrinhjava);
        tailieu.add(laptrinhdidong);
        System.out.println(laptrinhdidong.getPath());
        System.out.println(data.getStringTreeFolder());

    }
}
