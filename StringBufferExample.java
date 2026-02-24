import java.util.Scanner;

public class StringBufferExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first string
        System.out.print("Enter the first string: ");
        String input1 = sc.nextLine();

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer(input1);

        // i. Check capacity of StringBuffer
        System.out.println("Capacity of StringBuffer: " + sb.capacity());

        // ii. Reverse the string and convert to uppercase
        sb.reverse();
        String reversedUpper = sb.toString().toUpperCase();
        System.out.println("Reversed and Uppercase String: " + reversedUpper);

        // iii. Read another string and append it
        System.out.print("Enter the second string to append: ");
        String input2 = sc.nextLine();

        sb = new StringBuffer(reversedUpper);  // Create new buffer with modified string
        sb.append(input2);

        System.out.println("Final Appended String: " + sb.toString());

        sc.close();
    }
}