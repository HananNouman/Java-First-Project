package com.rbk.project1;
import java.util.Scanner;
import java.util.Arrays;
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

//    public void acceptAndReverse(){
//        Scanner dd = new Scanner(System.in);
//        int[] vars = new int[5];
//        for(int i = 4; i >=0; i--) {
//            System.out.println("Enter next var: ");
//            vars[i] = dd.nextInt();
//        }
//        System.out.println(Arrays.toString(vars));
//    }

    public void acceptAndReverse(){
        Scanner dd = new Scanner(System.in);
        int[] vars = new int[10];
        for(int i = 0; i <5; i++) {
            System.out.println("Enter next var: ");
            vars[i] = dd.nextInt();
            vars[(vars.length-1)-i] = vars[i];

        }
        System.out.println(Arrays.toString(vars));
    }

    public void repeatString(String str, int count) {
        String res="";
        for(int i = 0; i <count; i++) {
            res = res+str;

        }
        System.out.println(res);
    }


}
