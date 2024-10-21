package Java_3rdPractise_Set;

public interface Product {
    String getProductName();
    double getPrice();
}
class Electronics implements Product{
    String brand;
    int warrantyPeriod;
    String productName;
    double price;

    public Electronics(String brand, int warrantyPeriod, String productName, double price) {
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
        this.productName = productName;
        this.price = price;
    }

    public String getProductName(){
        return this.productName;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", warrantyPeriod=" + warrantyPeriod +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
class Clothing implements Product{
    String productName;
    double price;
String size;
String material;

    public Clothing(String productName, double price, String size, String material) {
        this.productName = productName;
        this.price = price;
        this.size = size;
        this.material = material;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
class ProductMain{
    public static void main(String[] args) {
        Electronics electronics=new Electronics("Philips",2,"LED",230);
        System.out.println(electronics.toString());
        System.out.println(electronics.getPrice());
        System.out.println(electronics.getProductName());
        Clothing clothing = new Clothing("Luke",650,"xl","Cotton");
        System.out.println(clothing.toString());
        System.out.println(clothing.getPrice());
        System.out.println(clothing.getProductName());
    }
}