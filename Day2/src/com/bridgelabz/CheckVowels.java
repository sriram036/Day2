package com.bridgelabz;
import java.util.Scanner;
public class CheckVowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Character:");
        char c = s.next().charAt(0);
        switch (c){
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':{
                System.out.println(c+" is a vowel.");
            }break;
            default:{
                System.out.println(c+" is a constant.");
            }
        }
    }
}
