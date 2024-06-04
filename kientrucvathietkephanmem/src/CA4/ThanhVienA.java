package behavioral.Observer.CA4;

public class ThanhVienA implements Topic.TopicListener{
    Topic topic;

    public ThanhVienA(Topic topic) {
        this.topic = topic;
        this.topic.dangky(this);
    }

    @Override
    public void listen(Tintuc t) {
        System.out.println("Thành viên A: ");
        System.out.println(t.toString());
    }
}
