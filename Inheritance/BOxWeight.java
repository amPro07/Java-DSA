package Inheritance;

public class BOxWeight extends Box{
    public double weight;

    public BOxWeight(){
        this.weight=-1;
    }

    public BOxWeight(double l, double h, double w, double weight){
        super(l, h, w); // calls base/parent class constructor.
        this.weight = weight;
    }
}
