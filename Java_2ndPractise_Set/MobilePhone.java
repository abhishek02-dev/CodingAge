package Java_2ndPractise_Set;

public class MobilePhone {
    String brand;
    String model;
    double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Google","Pixel 8",56000);
        MobilePhone phone2 = new MobilePhone("Vivo","V23e",28000);
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
    }
}
