package com.company;

import java.io.OutputStream;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your name please");
        int i;
        Cat[] cats = new Cat[]{new Cat("Barsik", 12, 10, 10),
                new NyanCat("Debil", "Kartoshkin", 15, 15, 15, "<3")
        };

        Scanner user = new Scanner(System.in);
        String username = user.nextLine();
        String love = "<3";

        for (i = 0; i < 2; ++i) {
            if (i < 2){
                cats[i].sayMeow(System.out, username);
            cats[i].sayAbout(System.out);}

        }
    }
}

  /*  public static void main(String[] args) {
        System.out.println("Enter your name please");
        int i ;
        Cat[] cats = new Cat[10];
        for (i = 0; i <10 ; i++)
        cats[i] = new Cat();
        Scanner user = new Scanner(System.in);
        String username = user.nextLine();
        String love = "<3";

        for (i = 0 ; i < 10 ; ++i) {
           cats[i].sayAbout(System.out);
           cats[i].sayMeow(System.out,username);





       System.out.println("Enter your name please");
        Cat Barsik = new Cat();
        Scanner user = new Scanner(System.in);
        String username = user.nextLine();
        Barsik.sayMeow(System.out, username);
        Barsik.sayAbout(System.out);
        String love = "<3";
        NyanCat Nyasha = new NyanCat();
        Nyasha.sayMeow(System.out, username, love);
        Nyasha.sayAbout(System.out);
        Nyasha.rainbow(System.out); */