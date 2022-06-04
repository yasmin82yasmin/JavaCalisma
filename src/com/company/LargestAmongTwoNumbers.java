package com.company;

public class LargestAmongTwoNumbers {
    public static void main(String[] args) {
        int x= 900;
        int y= 600;
        int z= 800;
        if(x>y && x>z){
            System.out.println("x is the greatest number");
        }else if(y>z){
            System.out.println("y is the greatest number");
        }else{
            System.out.println("z is the greatest number");
        }

    }
}
