import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        ComplexNumbers complexNumbers1 = new ComplexNumbers( x, y);
        ComplexNumbers complexNumbers2 = new ComplexNumbers( x, y);
        ComplexNumbers sum;
        System.out.println(" Sum: " + complexNumbers1.calculateSum(complexNumbers2));
        System.out.println(" Difference: " +complexNumbers1.calculateDiff(complexNumbers2));
        System.out.println(" Product: " +complexNumbers1.calculateProd(complexNumbers2));


    }
}

class ComplexNumbers{
    private double real;
    private double imaginary;

    public ComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String calculateSum(ComplexNumbers complexNumbers2) {
        double x =  real+ complexNumbers2.real;
        double y = imaginary + complexNumbers2.imaginary;
        return(x +" + "+ y+"i");
    }


    public String calculateDiff(ComplexNumbers complexNumbers2) {
        double x =  real- complexNumbers2.real;
        double y = imaginary - complexNumbers2.imaginary;
        return(x +" - "+ y+"i");
    }
    public String calculateProd(ComplexNumbers complexNumbers2) {
        double x =  real* complexNumbers2.real;
        double y = imaginary * complexNumbers2.imaginary;
        return(x +" * "+ y+"i");
    }

}
