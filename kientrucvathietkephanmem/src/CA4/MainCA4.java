package behavioral.Observer.CA4;



public class MainCA4 {
    public static void main(String[] args) {
        Topic topic = new Topic();
        Topic.TopicListener tvA = new ThanhVienA(topic);
        Topic.TopicListener tvB = new ThanhVienB(topic);
        System.out.println("Thêm tin mới lần 1: ");
        topic.themMoi(new Tintuc( 1,"Vụ tai nạn"));
        System.out.println("Thêm tin mới lần 2: ");
        topic.themMoi(new Tintuc(2,"Vụ cháy nhà"));
    }
}
