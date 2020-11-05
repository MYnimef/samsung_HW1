import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        System.out.println("Enter two values: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        System.out.println("Sum is: " + (a + b));
    }
}