package baitap.CD3;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Nước",2000,10));
        products.add(new Product("Bánh",100,10));
        System.out.println("Danh sách sản phẩm");
        for(Product pr:products)
            System.out.println(pr);
        SortCollection<Product> sortbyname= new SortProductByName();
        sortbyname.sort(products);
        System.out.println("Danh sách sau khi sắp xếp theo tên");
        for(Product pr:products)
            System.out.println(pr);
        SortCollection<Product> sortbyprice= new SortProductByPrice();
        sortbyname.sort(products);
        System.out.println("Danh sách sau khi sắp xếp theo giá");
        for(Product pr:products)
            System.out.println(pr);
    }
}
