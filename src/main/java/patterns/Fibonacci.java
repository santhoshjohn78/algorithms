package patterns;

import maps.CountWords;

import java.util.Scanner;

public class Fibonacci {

    int n1=0,n2=1,n3=0;

    public void printSeriesNR(Integer count){
        System.out.print(n1+" "+n2);
        while(count-2>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            count--;
        }
    }

    public void printSeries(Integer count) {
        if (n3<n2){
            System.out.print(n1+" "+n2);
        }
        if (count-2 > 0) {
            n3= n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printSeries(count-1);
        }

    }


    public int fibonacciSum(int n){
        if (n == 0){
            return 0;
        }else if (n==1){
            return 1;
        }else{
            return fibonacciSum(n - 1)+fibonacciSum(n-2);
        }
    }


    public static void main(String[] args){
        Fibonacci fibonacci = new Fibonacci();
        Fibonacci fibonacciR = new Fibonacci();

        System.out.println("Enter the number of elements in the series...");
        Scanner scanner = new Scanner(System.in);
        Integer number = Integer.parseInt(scanner.next());
        System.out.println("Non Recursive Series");
        fibonacci.printSeriesNR(number);
        System.out.println("\nRecursive Series");
        fibonacciR.printSeries(number);

        System.out.println("\nFib sum of "+number+" is "+fibonacciR.fibonacciSum(number));


    }
}
