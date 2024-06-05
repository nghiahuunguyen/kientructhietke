package thi.Observer.ca4;

public class main {
    public static void main(String[] args) {
        Topic topic = new Topic();
        TopicListener tvA = new ThanhVienA(topic);
        TopicListener tvB = new ThanhVienB(topic);
        System.out.println("Thêm tin mới lần 1: ");
        topic.themmoi(new TinTuc( 1,"Vụ tai nạn"));
        System.out.println("Thêm tin mới lần 2: ");
        topic.themmoi(new TinTuc(2,"Vụ cháy nhà"));
    }
}
