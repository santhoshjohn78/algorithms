package arrays;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * Need two loops
 * outer loop for the number of rotations
 *
 * Need to start from the last
 * Since the last element gets overwritten need to store it in a temp location
 * then the inner loop starts from the last element replace with previous one
 * before the next iteration of the outer loop set the first element with the temp value
 *
 */
public class StringArrayRotationV2 {

    // cat mat sat 2
    // sat cat mat 1
    // mat sat cat


    public void rotate(String[] args, int noRotations){

        // out loop
        while(noRotations-->0){

           String last = args[args.length-1];
           for (int i = args.length-1;i>0;i--){
               args[i] = args[i-1];
           }
           args[0] = last;
           Stream.of(args).forEach( a -> {System.out.print(a+" ");});
           System.out.println("");
        }
    }

    public static void main(String[] args){
        StringArrayRotationV2 sar = new StringArrayRotationV2();
        String[] strarr={"cat","bat","mat","sat"}; // rotates the array a,b,c,d to d,a,b,c if rotation count is 1
        sar.rotate(strarr,4);
    }
}
