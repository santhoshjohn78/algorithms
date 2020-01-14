package arrays;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MissingStrings {


    public static void missing_Words(List<String> s1, List<String> s2) {


        HashMap<String,Integer> s1Count=new HashMap<>();
        for(String str:s1){
            s1Count.put(str.trim(),0);
        }

        for (String str:s2){
            Integer count = s1Count.get(str.trim());
            if (count!=null){

                s1Count.put(str.trim(),++count);
            }

        }
        int cnt =0;
        for(String str:s1Count.keySet()){
            if (s1Count.get(str)==0)
            System.out.println(++cnt+". "+str+" --> "+s1Count.get(str));
        }
    }

    public static void main(String[] args) throws Exception{

        Path filePath = new File("/Users/UJOHNSA/Downloads/bookIds_CSG.txt").toPath();
        Charset charset = Charset.defaultCharset();
        List<String> stringList = Files.readAllLines(filePath, charset);



        Path filePath1 = new File("/Users/UJOHNSA/Downloads/bookids.txt").toPath();
        Charset charset1 = Charset.defaultCharset();
        List<String> stringList1 = Files.readAllLines(filePath1, charset1);

        missing_Words(stringList, stringList1);


    }
}
