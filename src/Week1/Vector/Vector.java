package Vector;

public class Vector implements IVector {
    private double x;
    private double y;

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        String a = "x = "+x+" y = "+y;
        return a;
    }
    public Vector times(double a){
        return new Vector(x*a,y*a);
    }
    public Vector add(Vector a){
        return new Vector(x+a.getX(),y+a.getY());
    }
    public boolean Equals(Vector a){
        return x==x&&y==y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

}
