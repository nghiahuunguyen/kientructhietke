package thi.Observer.ca6;

public class main {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData(3, 100,200);
        PlayerData.PlayerDataListener dashBoard = new Dashboard(playerData);
        System.out.println("Thiết lập thời gian mới: ");
        playerData.setThoiGian(400);
        System.out.println("Thiết lập số lượt chơi mới: ");
        playerData.setSoLuotChoi(4);
        System.out.println("Thiết lập điểm số mới: ");
        playerData.setDiemSo(200);
    }
}
