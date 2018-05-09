package com.rbk.project1;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Myclass {
    public static int a=0;
    public int b=generateRandom ();
    public static int n;

    public void printMsg (String word){
        System.out.println(word);
    }
    public static void input (){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
         n = reader.nextInt();
        //reader.close();
    }

    public static int generateRandom () {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        return  randomNum;
    }

    public void guessMyNumber() {
        System.out.println(b);
        a++;
        if(a<4){
            input();

        if(n>10||n<0){
            System.out.println("errooor");
        }
        else if(n==b){
            System.out.println("congraats");
            a=0;
            b=generateRandom ();
        }
//        else if(a>2){
//            System.out.println("errooor");
//            a=0;
//            b=generateRandom ();
//        }
        else{
            System.out.println("againnn");
            guessMyNumber();
        }
    }
    else{
            System.out.println("game over");
//            a=0;
//           b=generateRandom ();
        }
    }

//    public static int[] acceptAndReverse(int n){
//
//    }
}
