public class TaskSixFive {

    public static void main(String[] args) {

        AddAmount addAmount = new AddAmount();
        System.out.println(" No Parameter"+ addAmount.getAmount());

        AddAmount addAmount2= new AddAmount( 10);
        System.out.println(" with Parameter"+ addAmount2.getAmount());

    }


}

class AddAmount{
    private double amount  = 50;

    public AddAmount() {

    }

    public AddAmount(double amount) {
        this.amount += amount;

    }

    public double getAmount() {
        return amount;
    }
}
