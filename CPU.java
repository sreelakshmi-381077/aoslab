import java.util.Scanner;

class CPU {
    double price;

    // Inner class Processor
    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void displayProcessor() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    // Static inner class RAM
    static class RAM {
        int a, b, c, d;

        RAM(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        void addComplex() {
            int real = a + c;
            int imag = b + d;

            System.out.println("First Complex Number: (" + a + " + " + b + "i)");
            System.out.println("Second Complex Number: (" + c + " + " + d + "i)");
            System.out.println("Sum of Complex Numbers: (" + real + " + " + imag + "i)");
        }
    }

    CPU(double price) {
        this.price = price;
    }

    void displayPrice() {
        System.out.println("CPU Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CPU price
        System.out.print("Enter CPU price: ");
        double price = sc.nextDouble();
        CPU cpu = new CPU(price);

        // Processor details
        System.out.print("Enter number of cores: ");
        int cores = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter processor manufacturer: ");
        String manufacturer = sc.nextLine();

        CPU.Processor processor = cpu.new Processor(cores, manufacturer);

        // Complex number input for RAM
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        System.out.print("Enter d: ");
        int d = sc.nextInt();

        CPU.RAM ram = new CPU.RAM(a, b, c, d);

        // Display output
        System.out.println("\n--- CPU DETAILS ---");
        cpu.displayPrice();
        processor.displayProcessor();
        ram.addComplex();

        sc.close();
    }
}
