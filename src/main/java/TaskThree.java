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
//        ChecktheinputaescDesc();
//        FindDaysinMonth();
        //8 is already applied on 7
        //rightAnglePrint();
        //check2Decimal();
        PascalsTriangle();





    }

    private static void check2Decimal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Two decimal values : ");
        double one = input.nextDouble();
        double two = input.nextDouble();
        if(String.format("%.2f", one).equals( String.format("%.2f", two) )){
            System.out.println(" decimal match");
        }else{
            System.out.println("Invalid");
        }
    }

    private static void PascalsTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k);


               k =  k* (i-j)/j;

            }
            System.out.println("");

        }

    }

    private static void rightAnglePrint() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println("");

        }

    }

    private static void FindDaysinMonth() {
        int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthName = {"INVALID","January", " February", "March", "April", "May",
                        "June", "July", "August", "September", "October",
                "November", "December"};
        Scanner input = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int month = input.nextInt();
        System.out.print("Input a year: ");
        int year = input.nextInt();
        String monthNametoPrint = "INVALID month number";
        int monthNumberdays = 0;
//        if(month != monthDay[1]){
//            System.out.println(monthName[month] + " "+ year+ " has " + monthDay[month] + " days");
//        }else{
//
//        }

        switch (month){
            case 1:
                monthNametoPrint = monthName[1];
                monthNumberdays = monthDay[1];
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    monthNametoPrint = monthName[2];
                    monthNumberdays = 29;
                } else {
                    monthNametoPrint = monthName[2];
                    monthNumberdays = 28;
                }

                break;
            case 3:
                monthNametoPrint = monthName[3];
                monthNumberdays = monthDay[3];
                break;
            case 4:
                monthNametoPrint = monthName[4];
                monthNumberdays = monthDay[4];
                break;
            case 5:
                monthNametoPrint = monthName[5];
                monthNumberdays = monthDay[5];
                break;
            case 6:
                monthNametoPrint = monthName[6];
                monthNumberdays = monthDay[6];
                break;
            case 7:
                monthNametoPrint = monthName[7];
                monthNumberdays = monthDay[7];
                break;
            case 8:
                monthNametoPrint = monthName[8];
                monthNumberdays = monthDay[8];
                break;
            case 9:
                monthNametoPrint = monthName[9];
                monthNumberdays = monthDay[9];
                break;
            case 10:
                monthNametoPrint = monthName[10];
                monthNumberdays = monthDay[10];
                break;
            case 11:
                monthNametoPrint = monthName[11];
                monthNumberdays = monthDay[11];
                break;
            case 12:
                monthNametoPrint = monthName[12];
                monthNumberdays = monthDay[12];
                break;




        }
        System.out.println(monthNametoPrint + " "+ year+ " has " + monthNumberdays + " days");

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
