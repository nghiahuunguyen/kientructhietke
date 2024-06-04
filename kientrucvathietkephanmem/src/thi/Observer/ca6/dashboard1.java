package thi.Observer.ca6;

public class dashboard1 implements PlayDataListener2 {
    PlayData2 playData2;

    public dashboard1(PlayData2 playData2) {
        this.playData2 = playData2;
    }

    @Override
    public void listen(PlayData2 p) {
        System.out.printf(playData2.toString());
    }
}
