package mau;

public class ConcretePC extends PC{


    public ConcretePC(String mainboard, String CPU, String RAM, String storage, String screen, int vMainboard, int vCPU, int vRAM, int vStorage, int vScreen) {
        Mainboard = mainboard;
        this.CPU = CPU;
        this.RAM = RAM;
        Storage = storage;
        Screen = screen;
        this.vMainboard = vMainboard;
        this.vCPU = vCPU;
        this.vRAM = vRAM;
        this.vStorage = vStorage;
        this.vScreen = vScreen;
    }

    @Override
    public String build() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Mainboard).append("\n")
                .append(CPU).append("\n")
                .append(RAM).append("\n")
                .append(Storage).append("\n")
                .append(Screen).append("\n");
        return stringBuilder.toString();

    }

    @Override
    public int value() {
        return vMainboard+vCPU+vRAM+vScreen+vStorage;
    }
}
