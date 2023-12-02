public class Square {
    ;
    private int side;

    public Square(int side){
        System.out.println("Constructor From Square Class!");
        this.side = side;
    }

    public int getSide(){
        return side;
    }
    public double Area(){
        return side * side;
    }

    public double Perimeter() {
        return side;
    }



}
