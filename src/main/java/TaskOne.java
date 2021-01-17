import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        int a = 6, b = 4;
        swapThird(a, b);
        swapNoTemp(a, b);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter two numbers between 1- 10");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = x+ y;
        System.out.println(z+ 30);

    }

    private static void swapNoTemp(int a, int b) {
        a = a + b;
        b = a-b;
        a = a - b;
        System.out.println(" swapped with not temp \n  "+ " a: " + a + " b: " +  b );
    }

    private static void swapThird(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(" swapped with  temp \n  "+ " a: " + a + " b: " +  b );
    }
}
