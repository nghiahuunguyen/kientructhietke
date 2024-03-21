package baitap.a7;

public class maytinh {
    String CPU,Ram,SCREEN,HardDisk;

    public maytinh(Builder builder) {
        this.CPU = builder.CPU;
        this.Ram = builder.Ram;
        this.SCREEN = builder.SCREEN;
        this.HardDisk = builder.HardDisk;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("CPU: ").append(CPU).append("\n")
                .append("Ram: ").append(Ram).append("\n")
                .append("Màn hình: ").append(SCREEN).append("\n")
                .append("Ổ cứng: ").append(HardDisk);
        return builder.toString();
    }
    public static class Builder{
        private String CPU,Ram,SCREEN,HardDisk;
        public Builder setCPU(String CPU){
            this.CPU=CPU;
            return this;
        }
        public Builder setRam(String ram){
            this.Ram=ram;
            return this;
        }
        public Builder setSCREEN(String SCREEN){
            this.SCREEN=SCREEN;
            return this;
        }
        public Builder setHardDisk(String HarkdDisk){
            this.HardDisk=HarkdDisk;
            return this;
        }
        public maytinh build(){
            return new maytinh(this);
        }
    }
}
