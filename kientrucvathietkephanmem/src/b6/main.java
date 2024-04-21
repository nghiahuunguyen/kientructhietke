package b6;

public class main {
    public static void main(String[] args) {
        Bnode leaft1=new InnerNode(3);
        Bnode leaft2 =new InnerNode(4);
        leaft1.addL(leaft2);
        Bnode leaft3=new InnerNode(5);
        Bnode leaft4 =new InnerNode(6);
        leaft2.addL(leaft3);
        leaft2.addR(leaft4);
        Bnode leaft5 =new InnerNode(7);
        leaft1.addR(leaft5);
        Bnode leaft6=new InnerNode(8);
        Bnode leaft7 =new InnerNode(9);
        leaft5.addL(leaft6);
        leaft5.addR(leaft7);
        System.out.println(leaft1.duyet());;
    }
}
