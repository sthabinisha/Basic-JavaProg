import java.util.*;

public class TaskFour {
    public static void main(String[] args) {
        int[] arr = {23,25,23,87,47,1,91,51,2};
        //removeDuplicate(arr);
        //findSecondLargeVal(arr);
       // findSecondSmallersVal(arr);
        //addTwoMatrices();
       // FiveMoveZero();
        //SixRemoveDuplicates();

        //SevendiffBetLargeSmall(arr);
        //removeDuplicatereturnLen(arr);
        //nineSumeTwo(arr, 92);
        //TenClosestZero();
        ElevenAlternateVal(arr);

    }

    private static void ElevenAlternateVal(int[] arr) {

    }

    private static void TenClosestZero() {
        int[] arr = {1, 5, -4, 7, 8, -6};
        int min = Integer.MAX_VALUE;



        for (int i = 1; i < arr.length; i++) {
            if(Math.abs(arr[i-1] )< Math.abs(arr[i])){
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;

            }
            }
        int x = 0, y = 0 ;
        for (int i = 1; i < arr.length; i++) {
            if(Math.abs(arr[i-1] + arr[i]) < min){
                min = arr[i-1] + arr[i];

                 x = arr[i-1];
                 y = arr[i];


            }

        }

        System.out.println("Two elements whose sum is minimum are "+ x + " and "+ y);




        }

    private static void nineSumeTwo(int[] arr, int i) {


        int[] num = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            if(map.containsKey(arr[j])){
                num[0]= map.get(arr[j]);
                num[1] = arr[j];


            }else{
                map.put(i-arr[j], arr[j]);
            }




        }
        System.out.println(num[0]+ " and " + num[1]);



    }

    public static void removeDuplicatereturnLen(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);

        }

        System.out.println(set.size());

    }

    private static void SevendiffBetLargeSmall(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
           if(max<arr[i]){
               max = arr[i];
           }else if(arr[i]< min){
               min = arr[i];
           }

        }
        System.out.println(max -min + " diff");

    }

    private static void SixRemoveDuplicates() {
        int[] arr = {2,2,3,3,4,4,4,11,11,11,11};
        List<Integer> set = new ArrayList<>();
        int[] res = new int[arr.length];
        int count= 0;
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                set.add(0);
            }else
                set.add(arr[i]);


        }
        for (int i = 0; i < set.size(); i++) {
            if(set.get(i) != 0){
                res[count++] = set.get(i);
            }

        }

       while(count<arr.length){
           res[count++] = 0;
       }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");

        }


    }

    private static void FiveMoveZero() {
        int count = 0;
        int[] arr = {2,0,4,11,0,0,1, 1 ,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }

        }
        while(count<arr.length)
            arr[count++] = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }

    }

    private static void addTwoMatrices() {
        int[][] test = {{1, 2, 3 }, {2, 4, 3 }, {6, 7, 2}};
        int[][] test2 = {{1, 2, 3 }, {2, 4, 3 }, {6, 7, 2}};

        int[][] sum = new int[3][3];
        for(int i = 0; i< 3; i++){
            for (int j = 0; j < 3; j++) {
                sum[i][j] = test[i][j]+ test2[i][j];


            }
        }
        for(int i = 0; i< 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j]+"\t");


            }
            System.out.println();

        }
    }

    private static void findSecondLargeVal(int[] arr) {

        int first = Integer.MIN_VALUE, second= Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
        }
        System.out.println(second+ " second highest value");


    }
    private static void findSecondSmallersVal(int[] arr) {

        int first = Integer.MAX_VALUE, second= Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < first){
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }
        System.out.println(second+ " second smallest value");


    }

    private static void removeDuplicate(int[] arr) {

        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.contains(arr[i])){
                map.remove(arr[i]);

            }else{
                map.add(arr[i]);
            }
        }
        for(Integer key : map){
            System.out.print(key + " ");
        }

    }

}
