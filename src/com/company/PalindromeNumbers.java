package com.company;

public class PalindromeNumbers {
    public static void main(String[] args) {
        int num = 1331;
        int rev = 0;
        int actualNum = num ;


        while (num !=0){
            int n = num % 10;
            rev = rev *10 + n ;
            num = num/10;

        }
        System.out.println(rev);
        if(actualNum == rev) {
            System.out.println(actualNum + " is a palindrome");
        }else{
            System.out.println(actualNum + " is not a palindrome");
        }
    }
}
