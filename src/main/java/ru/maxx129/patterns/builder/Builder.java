package ru.maxx129.patterns.builder;

public class Builder {
    public static void main(String[] args) {

    }
}

class Flour {
    public String sort;
}

class Salt {}

class Additives {
    public String name;
}

class Bread {
    public Flour flour;
    public Salt salt;
    public Additives additives;


}