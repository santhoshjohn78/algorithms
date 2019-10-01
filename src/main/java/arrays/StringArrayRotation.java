package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayRotation {


    public void rotate(String[] args, int ntimes){

        List<String> tmp=new ArrayList<>();
        String tmparr[] = new String[args.length];

        for(int i=0;i<args.length;i++){
            int idx = (i+1)%args.length;
            System.out.println(idx);

            tmparr[idx]=args[i];
        }
       tmp = Arrays.asList(tmparr);

        tmp.forEach(System.out::print);

    }

    public static void main(String[] args){
            StringArrayRotation sar = new StringArrayRotation();
            String[] strarr={"a","b","c","d"};
            sar.rotate(strarr,1);
    }
}
