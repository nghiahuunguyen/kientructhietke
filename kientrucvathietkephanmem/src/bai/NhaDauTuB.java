package bai;

public class NhaDauTuB implements Tigia.TigiaObserver{
    Tigia t;

    public NhaDauTuB(Tigia t) {
        this.t = t;
    }

    public void  dangky(){
        t.attach(this);
    }
    public void huydangky(){
        t.detach(this);
    }

    @Override
    public void tigiaChanged(double delta) {
        if (delta<0){
            System.out.println("nhà đầu tư b:bán ra ");
        }
        else {
            System.out.println("nhà đầu tư b: mua vào");
        }
    }
}
