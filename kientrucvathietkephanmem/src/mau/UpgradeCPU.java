package mau;

public class UpgradeCPU extends PCDecorator {
    String addedCPU;
    int vAddedCPU;

    public UpgradeCPU(PC pc, String addedCPU, int vAddedCPU) {
        super(pc);
        this.addedCPU = addedCPU;
        this.vAddedCPU = vAddedCPU;
    }



    @Override
    public String build() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(pc.build()).append("\n")
                .append("Nang cap them: ").append(addedCPU);
        return stringBuilder.toString();
    }

    @Override
    public int value() {
        return pc.value()+vAddedCPU-pc.getvCPU();
    }
    @Override
    public int getvCPU() {
        return vAddedCPU;
    }
}
