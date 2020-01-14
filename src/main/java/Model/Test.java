package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static int Socks(int[] arr){
//        ArrayList<Integer> indexes = new ArrayList<>();
//        int bucket = 0;
//        for(int x = 0; x < arr.length; x++){
//            if(indexes.indexOf(x) != -1){
//                System.out.println("Skip: " + x);
//                continue;
//            }
//
//            for(int y = x+1; y < arr.length; y++){
//
//                    if(arr[x] == arr[y]){
//                        bucket++;
//                        indexes.add(y);
//                    }
//
//            }
//            System.out.println("Index: " + x);
//        }
//        return bucket;
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1] < arr.length){
                if(arr[i]==arr[i+1]){
                    count=count+1;
                    i=i+1;
                }
            }

        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args){
        System.out.println(Socks(new int[]{1, 2, 1, 2, 1, 3, 2}));
    }
}
