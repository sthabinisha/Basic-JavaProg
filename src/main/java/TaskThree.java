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
//        CheckInvalidInput();
//        PrintSumNaturalNum(20);
//        longInput();
        ChecktheinputaescDesc();



    }

    private static void ChecktheinputaescDesc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  3 numbers ");
        int[] arr = new int[3];
        int i = 0;
        while (scanner.hasNext()&& i<3){
            arr[i++] = scanner.nextInt();
        }
       if(arr[0]< arr[1] && arr[1]< arr[2] ){
           System.out.println("INCREASING");
       }else if(arr[0]> arr[1] && arr[1]> arr[2] ){
           System.out.println("DECREASING");

       }else{
           System.out.println("Neither increasing or decreasing order");
       }




    }

    private static void PrintSumNaturalNum(int num) {
        int sum = 0;
        while(num>0){
            sum+= num;
            num -= 1;

        }
        System.out.println(" THe total sum is : "+ sum);

    }

    private static void longInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  long number");

        long val = scanner.nextLong();
        //Not sure what to calculate; Question is not clear
        System.out.println(" out Value: "+  val);
        int sum = 0, rem = 0;
        while(val>0){
            rem = (int)val % 10;
            sum+= rem;
            val = val/ 10;

        }
        System.out.println(" THe total sum is : "+ sum);



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
