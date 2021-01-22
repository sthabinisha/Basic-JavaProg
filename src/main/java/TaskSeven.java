import java.util.*;

public class TaskSeven {
    public static void main(String[] args) {
        /*Program to reverse a string in java
          Program to find the first non-repeated character in the String
          Program to find the intersection of two arrays in java?
          Program to find if String has all Unique Characters?
          Program to Count the number of words in the String?
          Program to check the number is Armstrong number?
          Program to Count occurrences of each character in a string in java?
          Print all permutations of the String
          Find the maximum value in Array without using Collection?
          Find all possible combinations of String? (using recursion)
          Find to sort HashMap in java by keys and values?
          Program to find all the sub-array whose sum is equal to the given number?
*/
        int[] arr1 = {1, 2, 4, 6, 8, 9};
        int[] arr2 = {3, 5, 7, 1, 4,6};
        int num = 153;
        String str = "Binisha";
//        reverseString(str);
//        noRepeatedCharacter(str);
//        findIntersection(arr1, arr2);
//        System.out.println(isUnique(str));
//        countNumberWords("I am from London");
//        System.out.println( "the provided "+ num+" is "+armstrongNumber(num) +" for armstrong");
//        countCharOccurance(str);
//        strPermutation(str, "");
//        findMaxValue(arr1);
        strCombination(str, "");
        sortHashMap(str);
    }

    private static void sortHashMap(String str) {

        Map<Character, Integer> set = new LinkedHashMap<>();
        char[] c = str.toCharArray();
        for(int i = 0; i<c.length; i++){
            char a = Character.toLowerCase(c[i]);
            if(set.containsKey(a)){
                set.put(a,set.get(a)+1);
            }else{
                set.put(a, 1);
            }
        }

      Map<Character, Integer> treeset = new TreeMap<>(set);
        System.out.println("Sort by Keys: ");
        for (Map.Entry p:treeset.entrySet() ) {
            System.out.println("Key = " + p.getKey() +
                    ", Value = " + p.getValue());

        }

        Map<Character, Integer> hm1 = sortByValues(set);
        System.out.println("Sort by Values: ");
        for (Map.Entry<Character, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }

    }

    private static Map<Character, Integer> sortByValues(Map<Character, Integer> set) {
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(set.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o1.getValue().compareTo(o2.getValue()));
            }
        });
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for(Map.Entry<Character, Integer> e: list){
            map.put(e.getKey(), e.getValue());

        }
        return map;
    }

    private static void strCombination(String str, String ans) {
        StringBuilder sb = new StringBuilder();


           System.out.println(ans);

        for(int i = 0; i< str.length(); i++){
               strCombination(str.substring(i+1), ans+ str.charAt(i));

            }


        }




    private static void findMaxValue(int[] arr1) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr1.length; i++){
            if(arr1[i]> max){
                max = arr1[i];
            }

        }
        System.out.println("\n The maximum value in an array is: "+ max);
    }

    private static void strPermutation(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);

        }
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);

            String s = str.substring(0, i)+ str.substring(i+1);
            //System.out.println(s);
           strPermutation(s, ans+ch);

        }

    }

    private static void countCharOccurance(String str) {
        Map<Character, Integer> set = new LinkedHashMap<>();
        char[] c = str.toCharArray();
        for(int i = 0; i<c.length; i++){
            if(set.containsKey(c[i])){
                set.put(c[i],set.get(c[i])+1);
            }else{
                set.put(c[i], 1);
            }
        }
        for (Map.Entry p: set.entrySet()) {
            System.out.print(p.getKey()+""+p.getValue());
       }
    }

    private static boolean  armstrongNumber(int num) {
        int res = num;
        int sum = 0;
        while(num!= 0) {
            int rem = num % 10;
            sum += Math.pow(rem, 3);
            num = num / 10;
        }
        if(sum == res){
            return true;
        }else

        return false;

    }

    private static void countNumberWords(String str) {
        String[] res = str.split("\\s+");
        System.out.println(res.length);

    }

    private static boolean isUnique(String str) {

        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i< str.length(); i++){
            if(set.contains(str.charAt(i))){
                return false;
            }else
                set.add(str.charAt(i));

        }
        return true;


    }

    private static void findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> list = new HashSet<>();
        Set<Integer> list1 = new HashSet<>();
        for(int i = 0; i< arr1.length; i++){
            list.add(arr1[i]);

        }
        for(int i = 0; i< arr2.length; i++){
            if(list.contains(arr2[i]))
                list1.add(arr2[i]);

        }
        System.out.println(list1);
    }

    private static void noRepeatedCharacter(String str) {
        char[] c = str.toCharArray();
        LinkedHashMap<Character, Integer> set = new LinkedHashMap<>();
        for(int i = 0; i<c.length; i++){
            if(set.containsKey(c[i])){
                set.put(c[i],set.get(c[i]+1));
            }else{
                set.put(c[i], 1);
            }
        }
        for (Map.Entry p: set.entrySet()) {
            if(p.getValue().equals(1)){

                System.out.println("First non-repeted character in "+ str + " : "+ p.getKey());
                break;
            }else{
                System.out.println("String has no n0n-repeted character.");
            }

        }

    }

    private static void reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));

        }
        System.out.println(sb.toString());

    }
}
