package com.bridgelabz;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Please give a Number: ");
        n = s.nextInt();
        int i = 1;
        int n1 = 0;
        while(i<=n){
            n1 = n1+i;
            i++;
        }
        System.out.println(n1);
    }
}
