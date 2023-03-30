package com.bridgelabz;
import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int reverse = 0;
        System.out.println("Enter a Number: ");
        int num = s.nextInt();
        int num1 = num;
        while (num != 0){
            int lastDigit = num%10;
            reverse = reverse*10+lastDigit;
            num = num/10;
        }
        System.out.println("The reverse Number is "+ reverse + " and Original Number is "+ num1);
    }
}
