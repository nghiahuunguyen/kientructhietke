package thi.Observer.ca4;

public class ThanhVienA implements  TopicListener{
    Topic topic;

    public ThanhVienA(Topic topic) {
        this.topic = topic;
        this.topic.dangky(this);
    }

    @Override
    public void listen(TinTuc t) {
        System.out.println("Thành viên A: ");
        System.out.println(t.toString());
    }
}
