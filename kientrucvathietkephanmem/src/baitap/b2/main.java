package baitap.b2;

public class main {
    public static void main(String[] args) {
        String s = "Sinh viên và giáo viên được nghỉ lễ 30/4-1/5";
        Tokenize t = new TachTu(s);
        System.out.println(t.tokenize());
        t = new RemoveStopWord(t);
        System.out.println(t.tokenize());
        t = new RemovePunc(t);
        System.out.println(t.tokenize());

    }
}
