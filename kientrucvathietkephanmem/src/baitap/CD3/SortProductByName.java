package baitap.CD3;

class SortProductByName extends SortCollection<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.toString().compareTo(p2.toString());
    }
}
