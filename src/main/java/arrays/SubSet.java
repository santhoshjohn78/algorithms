package arrays;

import java.util.HashSet;

/**
 *
 * Implement an isSubset() function to take two arrays as input and check whether an array is a subset of another given array.
 */
public class SubSet {


    public static boolean isSubset(int[] arr1,int[] arr2){
        HashSet<Integer> uniqueCache = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            uniqueCache.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if (!uniqueCache.contains(arr2[i])){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {

        int[] arr1 = {9, 4, 7, 1, -2, 6, 5};
        int[] arr2 = {7, 1, -2};
        int[] arr3 = {10, 12};

        System.out.println(isSubset(arr1, arr2));
        System.out.println(isSubset(arr1, arr3));
    }
}
