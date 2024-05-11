package mau;

public abstract class PCDecorator extends PC{
    PC pc;

    public PCDecorator(PC pc) {
        this.pc = pc;
    }

    @Override
    public String build() {
        return null;
    }

    @Override
    public int value() {
        return 0;
    }
}
