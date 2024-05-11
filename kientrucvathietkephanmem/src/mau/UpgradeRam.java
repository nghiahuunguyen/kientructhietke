package mau;

public class UpgradeRam extends PCDecorator{
    String addedRam;
    int vAddedRam;

    public UpgradeRam(PC pc, String addedRam, int vAddedRam) {
        super(pc);
        this.addedRam = addedRam;
        this.vAddedRam = vAddedRam;
    }

    @Override
    public String build() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(pc.build()).append("\n")
                .append("Nang cap them: ").append(addedRam);
        return stringBuilder.toString();
    }

    @Override
    public int value() {
        return pc.value() + vAddedRam;
    }

    @Override
    public String getRAM() {
        return pc.getvRAM()+","+addedRam;
    }

    @Override
    public int getvRAM() {
        return pc.getvRAM()+ vAddedRam;
    }
}
