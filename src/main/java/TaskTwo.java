import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        checkDivision(20);
        SwitchCaseTest();
        thirdQuestion();
        fourQuestion();
        fiveQuestion();
        sixQuestion();

        eightQuestion();
    }

    private static void eightQuestion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter character value");
        char c = scanner.next().toLowerCase().charAt(0);
        char[] ca = {'r', 'a', 'n', 'd', 'o', 'm'};
        for (int i = 0; i <ca.length ; i++) {
            if(ca[i] == c){
                System.out.println("FOUND");
            }else
                System.out.println("NOT FOUND");

        }

    }

    private static void sixQuestion() {
        int x = 10;
        if(x %2 != 0){
            System.out.println("NEW");
        }else if(x >= 2 && x<=5){
            System.out.println("OLD");
        }else if(x >=6 && x<= 30){
            System.out.println("NEW");
        }else{
            System.out.println("OLD");
        }
    }

    private static void fiveQuestion() {
        for (int i = 0; i < 7; i++) {
            if(i == 3 || i ==6){
                continue;
            }
            System.out.println(i);

        }
    }

    private static void fourQuestion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter int value");
        int checkNum = scanner.nextInt();

        while (true){

            if(checkNum<0){
                System.out.println("Its Over");
                break;
            }else{
                System.out.println("Good Going");
                checkNum--;
                continue;

            }


        }

    }


    private static void checkDivision(int i) {
        if(i % 3 == 0 && i% 5 == 0){
            System.out.println("Consultadd JAVA Training");

        }else if(i % 3 != 0 && i% 5 == 0){
            System.out.println("JAVA Training");

        }else if(i % 3 == 0 && i% 5 != 0){
            System.out.println("Consultadd");

        }
    }
    private static void SwitchCaseTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose option from 1-5");
        System.out.println("1 - Addition \n 2 - Subtraction \n 3 - Division \n 4 - Multiplication " );
        int value = scanner.nextInt();
        System.out.println("Enter two value to use the operation");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int res = 0;
        switch (value){
            case 1:
                res = x+y;

                break;
            case 2:
                res = x-y;
                break;
            case 3:
                res = x/y;
                break;
            case 4:
                res = x*y;
            case 5:
                res = (x+y)/2;
                break;
            default:
                break;

        }
        if(res <0){
            System.out.println("Oops option "+ value+" is returning the negative number");
        }else{
            System.out.println(res);
        }

    }
    private static void thirdQuestion() {
        int a = 10, b= 20, c= 30;
        float avg = (float) (a+b+c)/ 3;
        System.out.println("avg: "+ avg);

        if(avg > a && avg > b && avg >c){
            System.out.println("avg is higher than a, b, c");
        }else if(avg > a && avg > b ){
            System.out.println("avg is higher than a, b, c");

        }else if(avg > a && avg >c){
            System.out.println("avg is higher than a, c");

        }else if(avg > b && avg >c){
            System.out.println("avg is hoghr than b, c");
        }
        else if(avg > a ){
            System.out.println("avg is just hight than a");

        }
        else if(avg >b){
            System.out.println("avg is just hight than b");

        }
        else if(avg >c){
            System.out.println("avg is just hight than c");

        }

    }


}
