import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number you want the multiplication for");
//        int  num = scanner.nextInt();
//        printMultiplecation(num);
//        System.out.println("Enter the  10 numbers ");
//        int[] arr = new int[10];
//        int i = 0;
//        while (scanner.hasNext()&& i<10){
//            arr[i++] = scanner.nextInt();
//        }
//        printSumof10Numbers(arr);
        CheckInvalidInput();



    }

    private static void CheckInvalidInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  10 numbers ");
        int[] arr = new int[12];
        int i = 0;
        while (scanner.hasNext()&& i<12){
             arr[i] = scanner.nextInt();
             while(arr[i] <0 ||arr[i]>12){
                 System.out.println("ERROR Please enter a valid age");
                 arr[i] = scanner.nextInt();

             }
             i++;

        }

    }

    private static void printSumof10Numbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        float avg = sum/arr.length;
        System.out.println(" sum of the array of printed value: "+ sum);
        System.out.println(" Average of the array of printed value: "+ avg);
    }

    private static void printMultiplecation(int num) {
        for (int i = 1; i <=10; i++) {
            int r = num * i;
            System.out.println(num +" * "+ i+" = "+ r);

        }
    }

}
