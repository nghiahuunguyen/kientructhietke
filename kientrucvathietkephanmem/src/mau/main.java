package mau;

public class main {
    public static void main(String[] args) {
        PC pc=new ConcretePC("abc","i5-1200k","16GB","1TB","144HZ",
                1,1,1,1,1);
        PCDecorator ram=new UpgradeRam(pc,"512GB",2);
        PCDecorator cpu=new UpgradeCPU(ram,"i9-1200k",1);
        System.out.println(cpu.build());
    }
}
