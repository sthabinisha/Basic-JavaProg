public class TaskSixSix {

    public static void main(String[] args) {
        Programming programming = new Programming();
        Programming programming1 = new Programming(" dancing");
    }

}
class Programming{
    private String str = " I Love";
    public Programming() {
        System.out.println("I love programming languages");
    }

    public Programming(String str) {
        this.str += str;
        System.out.println(this.str);
    }
}
