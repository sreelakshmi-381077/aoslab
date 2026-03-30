import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        // Taking input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        // Display original list
        System.out.println("Linked List before removing elements: " + list);

        // Removing all elements
        list.clear();

        // Display after clearing
        System.out.println("Linked List after removing elements: " + list);

        sc.close();
    }
}