package com.company;

public class PositiveAndNegativeNumber {
    public static void main(String[] args) {
        double number=0;

        if(number < 0.0){
            System.out.println(number + " is a negative number");
        }else if (number> 0.0){
            System.out.println(number + " is a positive number");
        }else{
            System.out.println(number + " is zero");
        }
    }
}
