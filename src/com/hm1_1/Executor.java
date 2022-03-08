package com.hm1_1;

class Quadratic {

    /*
    Решение квадратного уравнения
     */

    double a;
    double b;
    double c;
    double[] result;

    private void calculation () {
        double d = b * b - 4 * a * c;
        if (d>0) {
            result = new double[] {((-b + Math.sqrt(d)) / 2 * a), ((-b - Math.sqrt(d)) / 2 * a)};
        } else if (d==0) {
            result = new double[] {-(b / (2 * a))};
        } else System.out.println("No results. d < 0");
    }

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] getResult() {
        calculation();
        return result;
    }
}

public class Executor {

    private static void execute() {
        System.out.println("\n--- Solving a quadratic equation ---");
        Quadratic q = new Quadratic(4,5,1);

        int i = 1;
        for (double s: q.getResult()) {
            System.out.println("Result " + i + ":" + s);
            i++;
        }
    }

    public static void main(String[] args) {
        execute();
    }
}
