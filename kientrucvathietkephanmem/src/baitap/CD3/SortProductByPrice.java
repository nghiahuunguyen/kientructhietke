package baitap.CD3;

public class SortProductByPrice extends SortCollection<Product> {
    @Override
    public int compare(Product t1, Product t2) {
        if (t1.price < t2.price) {
            return -1;
        } else if (t1.price > t2.price) {
            return 1;
        } else {
            return 0;
        }
    }
}