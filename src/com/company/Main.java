package com.company;

public class Main {

    public static void main(String[] args) {
        Kwadrat square = new Kwadrat(5);
        System.out.println("Powierzchnia kwadratu o boku 5 wynosi: " + square.obliczPowierzchnie());
        Kolo circle = new Kolo(2);
        System.out.println("Powierzchnia kola o promieniu 2 wynosi: " + circle.obliczPowierzchnie());
        Kolo circle1 = new Kolo(5);
        System.out.println("Powierzchnia kola o promieniu 5 wynosi: " + circle1.obliczPowierzchnie());
    }
}

abstract class Ksztalt {
    double obliczPowierzchnie;
    double obliczObwod;
}

class Kwadrat extends Ksztalt {
    double dlugoscBoku;

    public Kwadrat(double bok) {
        dlugoscBoku = bok;

    }

    public double obliczPowierzchnie() {

        return dlugoscBoku * dlugoscBoku;
    }

    public double obliczObwod() {

        return dlugoscBoku * 4;
    }


}

class Kolo extends Ksztalt {
    double dlugoscR;

    public Kolo(double radius) {
        
        dlugoscR = radius;
    }

    public double obliczPowierzchnie() {

        return Math.PI * dlugoscR * dlugoscR;
    }

    public double obliczObwod() {

        return 2 * Math.PI * dlugoscR;
    }
}