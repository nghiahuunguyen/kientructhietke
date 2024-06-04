package thi.cb2;

public class main {
    public static void main(String[] args) {
        Vay CT = new chucvucuoicung("Nguyễn Văn A", "Chủ tịch", 500);
        Vay GD = new chucvuthongthuong("Nguyễn Văn B", "Giám đốc", 400);
        Vay TP = new chucvuthongthuong("Nguyễn Văn C", "Trưởng phòng", 300);
        Vay PTP = new chucvuthongthuong("Nguyễn Văn D", "Phó trưởng phòng", 100);

       PTP.vayketiep(TP)
               .vayketiep(GD)
               .vayketiep(CT);
       PTP.xuly(450);
    }
}