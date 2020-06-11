package entities;

public class Circle extends Figura2D {
    public int radius=10;

    @Override
    public void paint() {
        System.out.println("Circle.paint()");
    }

    @Override
    public void calArea(){
        System.out.println("Circle.calArea()="+ 3.1416*radius*radius);
    }
}