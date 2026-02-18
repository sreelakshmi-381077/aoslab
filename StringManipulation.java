import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length of the string: " + str.length());

      
        if (str.length() >= 4) {
            System.out.println("Character at second position: " + str.charAt(1));
            System.out.println("Character at fourth position: " + str.charAt(3));
        } else {
            System.out.println("String is too short to get 2nd and 4th characters.");
        }

        if (str.length() >= 3) {
            System.out.println("Substring from index 2: " + str.substring(2));
        }

        if (str.length() >= 5) {
            System.out.println("Substring from index 1 to 4: " + str.substring(1, 4));
        }

        // v. Concatenate another string
        System.out.print("Enter another string to concatenate: ");
        String str2 = sc.nextLine();
        String concatenated = str.concat(str2);
        System.out.println("Concatenated String: " + concatenated);

        // vi. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // vii. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        sc.close();
    }
}
