package Vector;

public interface IVector {
    String toString();
    Vector times(double a);
    Vector add(Vector a);
    boolean Equals(Vector a);
    double getX();
    double getY();

}
