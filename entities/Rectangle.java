package entities;

public class Rectangle  extends Figura2D {
    public int height;
    public int width;
    @Override
    public void paint() {
        System.out.println("Rectangle.paint()");
    }  
    @Override
    public void calArea(){
        System.out.println("Rectangle.calArea()");
    }
}