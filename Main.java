import java.util.Scanner;

// Step 1: Generic Stack Class
class Stack<T> {
    private int top;
    private int capacity;
    private T[] stackArray;

    // Constructor
    @SuppressWarnings("unchecked")
    public Stack(int size) {
        capacity = size;
        stackArray = (T[]) new Object[size];
        top = -1;
    }

    // Push operation
    public void push(T element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
        } else {
            stackArray[++top] = element;
            System.out.println(element + " pushed into stack");
        }
    }

    // Pop operation
    public T pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return null;
        } else {
            return stackArray[top--];
        }
    }

    // Display stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

// Step 2: Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack<Integer> stack = new Stack<>(size);

        int choice;

        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    Integer popped = stack.pop();
                    if (popped != null) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}