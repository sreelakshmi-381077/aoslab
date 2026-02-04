import java.util.Scanner;
import java.util.Arrays;

class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];

        // Input strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Sorting strings
        Arrays.sort(arr);

        // Output sorted strings
        System.out.println("Sorted strings:");
        for (String s : arr) {
            System.out.println(s);
        }

        sc.close();
    }
}
