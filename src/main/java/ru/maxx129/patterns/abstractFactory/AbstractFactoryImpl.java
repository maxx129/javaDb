package ru.maxx129.patterns.abstractFactory;

public class AbstractFactoryImpl {
    public static void main(String[] args) {
        Hero elf = new Hero(new ElfFactory());
        elf.hit();
        elf.run();

        Hero voin = new Hero(new VoinFactory());
        voin.run();
        voin.hit();
    }
}


abstract class Weapon {
    public abstract void hit();
}


abstract class Movement {
    public abstract void move();
}


class Arbalet extends Weapon {
    @Override
    public void hit() {
        System.out.println("Стреляем из арбалета");
    }
}


class Sword extends Weapon {
    @Override
    public void hit() {
        System.out.println("Машем мечом");
    }
}


class FlyMovement extends Movement {
    @Override
    public void move() {
        System.out.println("Летим");
    }
}


class RunMovement extends Movement {
    @Override
    public void move() {
        System.out.println("Бежим");
    }
}

abstract class HeroFactory {
    public abstract Weapon createWeapon();
    public abstract Movement createMovement();
}


class ElfFactory extends HeroFactory {
    @Override
    public Weapon createWeapon() {
        return new Arbalet();
    }

    @Override
    public Movement createMovement() {
        return new FlyMovement();
    }
}


class VoinFactory extends HeroFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Movement createMovement() {
        return new RunMovement();
    }
}


class Hero {
    private Weapon weapon;
    private Movement movement;

    public Hero(HeroFactory factory) {
        this.weapon = factory.createWeapon();
        this.movement = factory.createMovement();
    }

    public void run() {
        movement.move();
    }

    public void hit() {
        weapon.hit();
    }
}

