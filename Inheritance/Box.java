package Inheritance;

public class Box {
    public double l;
    public double h;
    public double w;

   public Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    public Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    public Box(double l, double h, double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    public void info(){
        System.out.println("Running the box.");
    }
}
