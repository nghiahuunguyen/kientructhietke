package factory;

public class Korean_HaisanPizza extends Pizza{
    @Override
    void prepare() {
        buffer.append("chuẩn bị bột gạo và 4 con cá cơm");
    }

    @Override
    void bake() {
        buffer.append("\n")
                .append("Nướng trên lò than trong 15 phút");
    }

    @Override
    void box() {
        buffer.append("\n")
                .append("Gói lá chuối");
    }

    @Override
    void cut() {
        buffer.append("\n")
                .append("Cắt tháng 4 miếng")
                .append("\n")
                .append("chúc bạn ngon miệng! hẹn gặp lại!");
    }
}
