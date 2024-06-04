package CA6;

public class Dashboard implements PlayerData.PlayerDataListener {
    PlayerData playerData;


    public Dashboard(PlayerData playerData) {
        this.playerData = playerData;
        this.playerData.DangKy(this);
    }

    @Override
    public void listen(PlayerData data) {
        System.out.println(playerData.toString());
    }
}
