package ru.maxx129.patterns.prototype;

public class Prototype {

    public static void main(String[] args) {
        Figure figure = new Rectangle(30,40);
        Figure clonedFigure = figure.clone();
        figure.getInfo();
        clonedFigure.getInfo();

        figure = new Circle(45);
        clonedFigure = figure.clone();
        figure.getInfo();
        clonedFigure.getInfo();

    }
}


interface Figure {
    Figure clone();
    void getInfo();
}

class Rectangle implements Figure{

    public int weigth;
    public int height;

    public Rectangle(int weigth, int height) {
        this.weigth = weigth;
        this.height = height;
    }

    @Override
    public Figure clone() {
        return new Rectangle(this.weigth, this.height);
    }

    @Override
    public void getInfo() {
        System.out.println("Прямоугольник шириной " + weigth + " и длиной " + height );
    }
}

class Circle implements Figure {

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Figure clone() {
        return new Circle(this.radius);
    }

    @Override
    public void getInfo() {
        System.out.println("Круг радиусом " + radius);
    }
}


