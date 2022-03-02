abstract class Shape{
    abstract void noOfSides();
}
class Rectangle extends Shape{
    void noOfSides(){
        System.out.println("Sides = 4");
    }
}
class Triangle extends Shape{
    void noOfSides(){
        System.out.println("Sides = 3");
    }
}
class Hexagon extends Shape{
    void noOfSides(){
        System.out.println("Sides = 6");
    }
}
class Main {
    public static void main(String args[]){
        Triangle tr = new Triangle();
        Rectangle rect = new Rectangle();
        Hexagon hex = new Hexagon();
        tr.noOfSides();
        rect.noOfSides();
        hex.noOfSides();
    }
}
