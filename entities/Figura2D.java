package entities;

public abstract class Figura2D {
    public int x;
    public int y;
    
    public abstract void calArea();

    public void paint() {
        System.out.println("Figura2D.paint()");
    }

}