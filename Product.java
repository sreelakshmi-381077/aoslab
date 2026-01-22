class Product {
    int pcode;
    String pname;
    double price;

    // Constructor
    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 55000);
        Product p2 = new Product(102, "Mobile", 30000);
        Product p3 = new Product(103, "Tablet", 20000);

       
        Product lowest = p1;

        // Compare prices
        if (p2.price < lowest.price) {
            lowest = p2;
        }
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        System.out.println("Product with lowest price:");
        System.out.println("Code: " + lowest.pcode);
        System.out.println("Name: " + lowest.pname);
        System.out.println("Price: " + lowest.price);
    }
}
