package com.bridgelabz;
import java.util.Scanner;
public class MonthName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = s.nextInt();
        switch (n){
            case 1:{
                System.out.println("The Month is January.");
            }break;
            case 2:{
                System.out.println("The Month is February.");
            }break;
            case 3:{
                System.out.println("The Month is March.");
            }break;
            case 4:{
                System.out.println("The Month is April.");
            }break;
            case 5:{
                System.out.println("The Month is May.");
            }break;
            case 6:{
                System.out.println("The Month is June.");
            }break;
            case 7:{
                System.out.println("The Month is July.");
            }break;
            case 8:{
                System.out.println("The Month is August.");
            }break;
            case 9:{
                System.out.println("The Month is September.");
            }break;
            case 10:{
                System.out.println("The Month is October.");
            }break;
            case 11:{
                System.out.println("The Month is November.");
            }break;
            case 12:{
                System.out.println("The Month is December.");
            }break;
        }
    }
}
