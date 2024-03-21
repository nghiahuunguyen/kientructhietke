package baitap.a2;

public class MyStringBuilder {
    String s;
    float f;
    boolean b;

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append(s).append("\n")
                .append(f).append("\n")
                .append(b);
        return builder.toString();
    }

    public MyStringBuilder(Bulider bulider) {
        this.s = bulider.s;
        this.f = bulider.f;
        this.b = bulider.b;
    }
    public static class Bulider{
        private String s;
        private float f;
        private boolean b;
        public Bulider addString (String s){
            this.s=s;
            return this;
        }
        public Bulider addFloat(float f){
            this.f=f;
            return this;
        }
        public Bulider addBool(boolean b){
            this.b=b;
            return this;
        }
        public MyStringBuilder bulider(){
            return new MyStringBuilder(this);
        }
    }
}
