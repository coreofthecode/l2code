package com.company;

import java.io.OutputStream;
import java.io.PrintStream;

public class NyanCat extends Cat {
    NyanCat(String name, String surname, int weight, int age, int taillenght, String love) {
        super();
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.age = age;
        this.taillenght = taillenght;
        this.love = love;
    }

    public void sayMeow(PrintStream out, String userName) {
        out.println("Meow, my lovely " + userName + "! " + getLove());
    }

    private String love;

    public String getLove() {
        return this.love;
    }

    public void setLove() {
        this.love = love;
    }

    private String surname;

    public String getSurname() {
        return this.surname;
    }

    public void setSurname() {
        this.surname = surname;
    }

    public void sayAbout(PrintStream out) {
        out.println("My Name is: " + getName() + " My Surname is: " + getSurname() + " I`m " + getAge() + " years old");
        out.println("I have a big tall " + getTailLenght() + " Santimeters");
        out.println("I'm so fat " + getWeight() + " Kilo`s ");
    }

    public void rainbow(PrintStream out) {
        out.println("I can make a rainbow for you,my friend: ");
        out.println("Red!");
        out.println("Orange!");
        out.println("Yellow!");
        out.println("Green!");
        out.println("Blue!");
        out.println("Indigo!");
        out.println("Violet!");
    }

}
