package baitap.bai5;

public class Context {
    //su dung tp tuy bien thong qua 1 doi tuong
    private Tinh tinh;
    //setter  đc sử dụng để gán 1 đôi tượng cụ thể khi sử dụng chop bến đại diện khi sd
    public Context setTinh(Tinh tinh) {
        this.tinh = tinh;
        return this;
    }
    public float tinh(float a,float b){
        return  tinh.tinh(a,b);
    }
}
