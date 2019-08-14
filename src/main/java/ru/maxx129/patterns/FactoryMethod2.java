package ru.maxx129.patterns;

public class FactoryMethod2 {

    public static void main(String[] args) {
        PlaneFactory planeFactory = new PlaneFactory(1);
        planeFactory.factoryMethod(4);
    }
}

class Plane {
}

class CivilPlane extends Plane {
    public CivilPlane() { System.out.println("I`m flying at 900 km/h"); }
}

class CombatPlane extends Plane {
    public CombatPlane() {
        System.out.println("System.out.println(\"I`m flying at 2500 km/h\"");
    }
}

class CargoPlane extends Plane {
    public CargoPlane() {
        System.out.println("System.out.println(\"I`m flying at 750 km/h\"");
    }
}

class PlaneFactory {
    private int marker;

    public PlaneFactory(int marker) {
        this.marker = marker;
    }

    public Plane factoryMethod (int marker) {

        if (marker == 1) { return new CivilPlane(); }
        if (marker == 2) { return new CombatPlane(); }
        if (marker == 3) { return new CargoPlane(); }

        throw new IllegalArgumentException();
    }


}


