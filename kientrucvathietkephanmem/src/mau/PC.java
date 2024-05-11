package mau;

public abstract class PC {
    String Mainboard, CPU, RAM, Storage, Screen;
    int vMainboard, vCPU, vRAM, vStorage, vScreen;
    public abstract String build();
    public abstract int value();

    public String getMainboard() {
        return Mainboard;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return Storage;
    }

    public String getScreen() {
        return Screen;
    }

    public int getvMainboard() {
        return vMainboard;
    }

    public int getvCPU() {
        return vCPU;
    }

    public int getvRAM() {
        return vRAM;
    }

    public int getvStorage() {
        return vStorage;
    }

    public int getvScreen() {
        return vScreen;
    }
}
