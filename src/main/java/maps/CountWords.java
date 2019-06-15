package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CountWords {

    public HashMap<String,Integer> count(String sentence){
        HashMap<String, Integer> countMap = new HashMap<String,Integer>();
        sentence = sentence.replace(".","");
        List<String> words = Arrays.asList(sentence.split("\\s+"));
        for(String word:words){
            Integer count = countMap.get(word);
            count = (count==null)?1:++count;

            countMap.put(word,count);
        }
        return countMap;
    }

    public void print(HashMap<String,Integer> countMap){
        countMap.forEach((k,v)->{System.out.println("key="+k+",value="+v); });

    }

    public static void main(String[] args){
        CountWords ctwords = new CountWords();

        System.out.println("Enter a sentence...");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        ctwords.print(ctwords.count(line));

    }
}
