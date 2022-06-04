package com.company;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 1234; //4321
        int rev = 0;
        while (num !=0){
            int n = num % 10; // % 10 is reminder
            rev = rev * 10 + n; //4
            num = num/10;
        }
        System.out.println("reverse number is : " + rev); // simple print variable
    }
}
