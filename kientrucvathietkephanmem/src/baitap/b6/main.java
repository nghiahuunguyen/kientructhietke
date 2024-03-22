package baitap.b6;

public class main {
    public static void main(String[] args) {
        InnerBnode B = new InnerBnode(100);
        InnerBnode B1 = new InnerBnode(10);
        InnerBnode B2 = new InnerBnode(20);
        Leaft leaf1 = new Leaft(1);
        Leaft leaf2 = new Leaft(2);
        B.add(B1);
        B.add(B2);
        B1.add(leaf1);
        B2.add(leaf2);
        B.duyet();
    }
}
