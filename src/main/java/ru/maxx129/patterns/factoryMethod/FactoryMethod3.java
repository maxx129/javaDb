package ru.maxx129.patterns.factoryMethod;

public class FactoryMethod3 {
    public static void main(String[] args) {
        Developer dev1 = new PanelDeveloper("Шараш Монтаж");
        House house1 = dev1.create();
    }



}

abstract class Developer {
    private String name;

    public Developer(String n) {
        this.name = n;
    }

    abstract public House create();
}

class PanelDeveloper extends Developer {
    public PanelDeveloper(String n) {
        super(n);
    }

    @Override
    public House create() {
        return new PanelHouse();
    }
}


class WoodDeveloper extends Developer {
    public WoodDeveloper(String n) {
        super(n);
    }

    @Override
    public House create() {
        return new WoodHouse();
    }
}





abstract class House {

}

class PanelHouse extends House {
    public PanelHouse() {
        System.out.println("Панельный дом построен");
    }
}

class WoodHouse extends House {
    public WoodHouse() {
        System.out.println("Деревяннный дом построен");
    }
}
