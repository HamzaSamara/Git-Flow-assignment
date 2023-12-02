public class Circle {

    private final double pi = 3.14;
    private int radius;

    public Circle(int radius){
        System.out.println("Constructor From Circle Class!");
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }
    public double Area(){
        return pi * radius * radius;
    }

    public double Perimeter() {
        return 2 * pi * radius;
    }

}
