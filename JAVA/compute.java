package JAVA;

class compute {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        circle c1 = new circle();
        area item;
        item = t1;
        double tarea = item.find_area(6.23, 9.716);
        System.out.println("area of trinagle=" + tarea);
        item = c1;
        double clarea = item.find_area(2.0, 2.0);
        System.out.println("area of circle=" + clarea);
    }
}

interface area {
    static double pie = 3.142;

    double find_area(double m, double n);
}

class triangle implements area {
    public double find_area(double m, double n) {
        double aot = 0.5 * m * n;
        return (aot);
    }
}

class circle implements area {
    public double find_area(double m, double n) {
        double aoc = pie * m * n;
        return (aoc);
    }
}