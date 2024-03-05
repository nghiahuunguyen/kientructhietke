package factory;

public abstract class Pizza {
    StringBuffer buffer = new StringBuffer();
    abstract void prepare();
    abstract void bake();
    abstract void box();
    abstract void cut();

    @Override
    public String toString() {
        return buffer.toString();
    }
}
