package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayRotation {


    public void rotate(String[] args, int ntimes){

        List<String> tmp=new ArrayList<>();


        while(ntimes-->0){
            String tmparr[] = new String[args.length];
            for(int i=0;i<args.length;i++){
                int idx = (i+1)%args.length;
                tmparr[idx]=args[i];
            }
            tmp = Arrays.asList(tmparr);

            tmp.forEach(System.out::print);
            args=tmparr;
            System.out.println("**********");
        }



    }

    public static void main(String[] args){
            StringArrayRotation sar = new StringArrayRotation();
            String[] strarr={"a","b","c","d"}; // rotates the array a,b,c,d to d,a,b,c if rotation count is 1
            sar.rotate(strarr,4);
    }
}
