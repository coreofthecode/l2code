package com.company;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Cat {
    public Cat(){}
    Cat(String name, int age, int weight, int taillenght) {
       this.name = name;
       this.age = age;
       this.weight = weight;
       this.taillenght = taillenght;
    }

    ;
    protected String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected int weight;

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    protected int taillenght;

    public int getTailLenght() {
        return this.taillenght;

    }

    public void setTailLenght(int tailLenght) {
        this.taillenght = tailLenght;
    }

    public void sayAbout(PrintStream out) {
        out.println("My Name is: " + getName() + " I`m " + getAge() + " years old");
        out.println("I have a big tall " + getTailLenght() + " Santimeters");
        out.println("I'm so fat " + getWeight() + " Kilo`s ");
    }

    public void sayMeow(PrintStream out, String userName) {

        out.println("Meow, " + userName + "!");
    }
}
