package com.company;

public class VomelAndConsonant {
    public static void main(String[]args){
        //a e i o u
        char ch='o';
        if(ch =='a' || ch =='e' || ch =='i'|| ch == 'o' || ch == 'u'){
            System.out.println(ch + " is vomel");
        }else{
            System.out.println(ch + " is consonant");
        }
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
                break;

        }
    }
}
