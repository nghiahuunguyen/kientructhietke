package baitap.CD3;

public class Product {
     String name;
    int price,quantily;

    public Product(String name, int price, int quantily) {
        this.name = name;
        this.price = price;
        this.quantily = quantily;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    @Override
    public String toString() {
        return
                "Tên: "  + name + '\n' +
                "Đơn giá: " + price +'\n'+
                "Số lương: " + quantily ;
    }
}
