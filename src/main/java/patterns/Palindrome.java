package patterns;

import maps.CountWords;

import java.util.Scanner;

public class Palindrome {

    public boolean isPalindrome(int x) {
        String strX = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(strX);
        StringBuilder reverseBuilder = stringBuilder.reverse();
        String reverseStr = reverseBuilder.toString();
        if (reverseStr.equals(strX)){
            return true;
        }else{
            return false;
        }
    }

    public boolean isPalindromeV2(int x){
        int rev =0;
        int y = x;
        while(y!=0){
            rev=rev*10 + y%10;
            y = y /10;
        }
        return x==rev;

    }

    public static void main(String[] args){
        Palindrome ctwords = new Palindrome();

        System.out.println("Enter a sentence...");
        Scanner scanner = new Scanner(System.in);
        Integer line = scanner.nextInt();

        System.out.print(ctwords.isPalindromeV2(line));

    }
}
