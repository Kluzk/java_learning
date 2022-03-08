package com.hm1_2;

abstract class Figure {

    double volume, area;

    abstract void calcVolume();
    abstract void calcArea();

    public double getVolume() {
        calcVolume();
        return this.volume;
    }

    public double getArea() {
        calcArea();
        return this.area;
    }
}

class Cube extends Figure {

    double a;

    public Cube(double a) {
        super();
        this.a = a;
    }

    @Override
    void calcVolume() {
        super.volume = a*a*a;
    }

    @Override
    void calcArea() {
        super.area = 6*a*a;
    }
}

class Sphere extends Figure {

    double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    void calcVolume() {
        super.volume = 4.0 / 3.0 * Math.PI * r * r * r;
    }

    @Override
    void calcArea() {
        super.area = 4.0 * Math.PI * r * r;
    }
}

class Parallelepiped extends Figure {

    double a, b, c;

    public Parallelepiped(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void calcVolume() {
        super.volume = a * b * c;
    }

    @Override
    void calcArea() {
        super.area = 2 * (a * b + b * c + c * a);
    }
}



public class Executor {

    static void execute() {
        //Sphere s = new Sphere(17.3);
        Sphere s = new Sphere(3);
        Cube c = new Cube(4.33);
        Parallelepiped p = new Parallelepiped(3.4, 2.1, 6.3);

        System.out.println("Cube volume: " + c.getVolume() + "; area: " + c.getArea());
        System.out.println("Sphere volume: " + s.getVolume() + "; area: " + s.getArea());
        System.out.println("Parallelepiped volume: " + p.getVolume() + "; area: " + p.getArea());
    }

    public static void main(String[] args) {
        execute();
    }
}
