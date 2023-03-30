package com.bridgelabz;
import java.util.Scanner;
public class FindPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = s.nextInt();
        int num1 = num;
        int reverse = 0;
        while (num1!=0){
            int lastDigit = num1%10;
            reverse = reverse*10+lastDigit;
            num1 = num1/10;
        }
        System.out.println("The Reversed Number is "+ reverse);
        if (num == reverse){
            System.out.println("The given Number "+num+" is a Palindrome Number.");
        }
        else {
            System.out.println("The given Number "+num+" is not a Palindrome Number.");
        }
    }
}
