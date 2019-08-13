package ru.maxx129.patterns;

import java.util.ArrayList;
import java.util.List;

public class FactoryMothod {

    public static void main(String[] args) {
        List<Chocolate> chocolate = new ArrayList();
    }
}


interface Chocolate {
    void printPrise();
}

class BlackChocolate implements Chocolate {
    private final int prise = 10;

    @Override
    public void printPrise() {
        System.out.println(prise);
    }
}

class WhiteChocolate implements Chocolate {
    private final int prise = 15;

    @Override
    public void printPrise() {
        System.out.println(prise);
    }
}


abstract class Factory {
    private int flag;

    Factory(int flag) {
        this.flag = flag;
    }

    abstract Chocolate create();
}