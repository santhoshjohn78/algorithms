package arrays;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Have 2 for loops outer forloop starts from 0th element inner starts at 1th element
 * check if a[0]+a[1] == target number if so return else continue
 *
 */
public class TwoNumberSum {


    public static int[] findSum(int[] inputs, int target){

        for(int i=0;i<inputs.length;i++){

            for(int j=i+1;j<inputs.length;j++){
                if (inputs[i]+inputs[j]==target){
                    return new int[]{inputs[i],inputs[j]};
                }
            }
        }
        return null;
    }

    public static int[] findSumV2(int[] nums, int target){
        int[] sumarr = new int[2];
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if (numsMap.containsKey(target-nums[i])){
                sumarr[0]=numsMap.get(target-nums[i]);
                sumarr[1]=i;
                return sumarr;
            }
            numsMap.put(nums[i],i);
        }
        return sumarr;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = keyboard.nextInt();
        }
        int target = keyboard.nextInt();

        keyboard.close();
        int[] result = findSumV2(nums,target);
        if (result.length==2){
            System.out.println("If you add "+result[0] +" and "+result[1]+" you get "+target);
        }else{
            System.out.println("No solution");
        }
    }

}
