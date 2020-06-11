package entities;

public class Circle extends Figura2D {
    public int radius;

    @Override
    public void paint() {
        System.out.println("Circle.paint()");
    }
    
    @Override
    public void calArea(){
        System.out.println("Circle.calArea()");
    }
}