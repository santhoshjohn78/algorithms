package patterns;

import java.util.HashMap;

public class RomanNumerals {

    public int romanToInt(String romanNum){
        HashMap<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        Integer result=0;
        for(int i=0;i<romanNum.length();i++){
            if (i>0 && romanMap.get(romanNum.charAt(i))>romanMap.get(romanNum.charAt(i-1))){
                result+=romanMap.get(romanNum.charAt(i))-2*(romanMap.get(romanNum.charAt(i-1)));
            }else{
                result+=romanMap.get(romanNum.charAt(i));
            }


        }

        return result;
    }

    public static void main(String args[]){
        RomanNumerals romanNumerals = new RomanNumerals();
        System.out.println(romanNumerals.romanToInt("XVIIMD"));
        System.out.println(romanNumerals.romanToInt("XIII"));
    }
}
