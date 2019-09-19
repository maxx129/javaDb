package ru.maxx129.patterns.singleton;

public class Singleton {

    public int a;
    public int b;
    public int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Singleton(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
