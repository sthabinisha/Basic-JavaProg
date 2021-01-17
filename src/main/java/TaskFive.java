
import java.nio.charset.Charset;
import java.util.*;

public class ArrayString {

    public static void main(String[] args) {
        String testKey = "Be Happy and Stay Motivated";
        int[] arr = {22,44,64,76,98,12,43,54,90};
        int[] arr1 = {23,25,75,87,47,1,91,51,2};
        ShortestWord(testKey);
        sumofArray(arr);
        removeSpace(testKey);
        System.out.println(" \nboolean: "+ isogram(testKey));
        reverseString(testKey);
        evenFromOdds(arr, arr1);
        swapCase("heLLo WOrLd");
        System.out.println(" \nboolean braces: "+ checkBraces("({{)}[}]()"));


    }

    private static boolean checkBraces(String s) {
        System.out.println(s);
        HashMap<Character,Character> maps=new HashMap<Character,Character>();
        maps.put(')','(');
        maps.put(']','[');
        maps.put('}','{');
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(maps.containsKey(c)){
                if(stack.empty()||stack.pop()!=maps.get(c))
                    return false;
            }
            else
                stack.push(c);
        }
        return stack.empty();


    }

    private static void swapCase(String heLLo_wOrLd) {
        char[] c = heLLo_wOrLd.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i]>96 && c[i]< 123){
                c[i] =Character.toUpperCase(c[i]);

            }else{
                c[i] = Character.toLowerCase(c[i]);
            }
            System.out.print(c[i]);
        }

    }

    private static void evenFromOdds(int[] arr, int[] arr1) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                continue;

            }else{
                res = arr[i];
                break;

            }

        }
        System.out.println("Odd out: " +res);
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]%2 != 0){
                continue;

            }else{
                res = arr1[i];
                break;

            }

        }
        System.out.println("Even out: " +res);

    }

    private static void reverseString(String testKey) {
        String[] key = testKey.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < key.length; i++) {
            for (int j = key[i].length() -1; j >= 0 ; j--) {
                stringBuilder.append( key[i].charAt(j));

            }
           stringBuilder.append(" ");



        }
        System.out.println(stringBuilder.toString());
    }

    private static boolean isogram(String testKey) {
        if(testKey.length()> 128){
            return false;
        }
        Set<Character> map = new HashSet<>();

        char[] c = testKey.toCharArray();
        for (char key: c) {
            if(map.contains(key)){
                return false;
            }
            map.add(key);


        }

        return true;
    }

    private static void removeSpace(String testKey) {
         String testKey1 = testKey.replaceAll("\\s+", "");
        System.out.println(testKey1);

        String[] arr = testKey.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
    }

    private static void sumofArray(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 1; i < arr.length- 1; i++) {
            sum += arr[i];


        }
        System.out.println("the sum except the highest and lowest values: "+ sum);

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
