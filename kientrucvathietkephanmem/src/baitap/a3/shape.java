package baitap.a3;

public  abstract class shape {
    String brush,paper,frame;

    public shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
    abstract String draw();
}
