package com.bridgelabz;
import java.util.Scanner;
public class SumOfNaturalNumbersWithForLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give a Number: ");
        int n = s.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("Total is "+ sum);
    }
}
