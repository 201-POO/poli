package entities;

public class Rectangle  extends Figura2D {
    public int height=10;
    public int width=10;
    @Override
    public void paint() {
        System.out.println("Rectangle.paint()");
    }  
    @Override
    public void calArea(){
        System.out.println("Rectangle.calArea()="+height*width);
    }
}