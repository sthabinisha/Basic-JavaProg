import java.util.Arrays;

public class ArrayString {

    public static void main(String[] args) {
        String testKey = "Be Happy and Stay Motivated";
        int[] arr = {22,44,64,76,98,12,43,54,90};
        ShortestWord(testKey);
        sumofArray(arr);
    }

    private static void sumofArray(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 1; i < arr.length- 1; i++) {
            sum += arr[i];


        }
        System.out.println(" the sum except the highest and lowest values: "+ sum);

    }

    private static void ShortestWord(String testKey) {
        String[] arr = testKey.split("\\s+");
        int min  =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()< min){
                min = arr[i].length();
            }

        }
        System.out.println("Shorted length of the word: "+min);


    }
}
