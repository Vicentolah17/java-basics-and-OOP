package entities;

public class Rectangle {
    public double w;
    public double h;
    public double p;

    public double area(){
        return (w*h);
    }

    public double perimeter(){
        return 2 * (w * h);
    }


    public double diagonal(){
        p=Math.sqrt(Math.pow(w,2) + Math.pow(h,2));
        return p;
    }

}
