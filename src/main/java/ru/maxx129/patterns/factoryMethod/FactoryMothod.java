package ru.maxx129.patterns.factoryMethod;

import java.util.ArrayList;
import java.util.List;




interface Chocolate {
    void printType();
}

class BlackChocolate implements Chocolate {
    private final String type = "Black";

    public void printType() {
        System.out.println(type);
    }
}

class WhiteChocolate implements Chocolate {
    private final String type = "White";


    public void printType() {
        System.out.println(type);
    }
}


abstract class Factory {
    public int flag;

    Factory(int flag) {
        this.flag = flag;
    }

    abstract Chocolate create();
}

class CreatorFactory extends Factory {

    CreatorFactory(int flag) {
        super(flag);
    }

    @Override
    Chocolate create() {
        if(flag ==0) {
            return new BlackChocolate();
        }
        if(flag == 1) {
            return new WhiteChocolate();
        }
        throw new IllegalArgumentException();
    }
}

public class FactoryMothod {

    public static void main(String[] args) {
        List<Chocolate> chocolate = new ArrayList();
        Factory factory = new CreatorFactory(1);
        factory.create().printType();
    }
}