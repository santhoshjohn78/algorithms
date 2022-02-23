package arrays;

import java.util.Scanner;

/**
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
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
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = keyboard.nextInt();
        }
        int target = keyboard.nextInt();

        keyboard.close();
        int[] result = findSum(nums,target);
        if (result.length==2){
            System.out.println("If you add "+result[0] +" and "+result[1]+" you get "+target);
        }else{
            System.out.println("No solution");
        }
    }

}
