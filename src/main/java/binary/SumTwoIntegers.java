package binary;

/**
 *
 * Input: a = 1, b = 2
 * Output: 3
 * Constraint cannot use + or - operators
 * Hint: use ++ or --
 *
 */
public class SumTwoIntegers {

    public static void printSum(int a, int b){

        if (b>0){
            while (b>0){
                a++;
                b--;
            }
        }
        if (b<0){
            while (b<0){
                a--;
                b++;
            }
        }
        System.out.println("Sum is "+a);
    }

    public static void main(String[] args){
        printSum(4,77);
    }
}
