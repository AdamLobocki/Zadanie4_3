public class Test {
    public static void main(String[] args) {


        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(5, 7, 234);

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        double sA = square.squareArea();
        double cA = circle.circleArea();
        double tP = triangle.trianglePerimeter();
        double rP = rectangle.rectPerimeter();

        System.out.println("Pole kwadratu: " + sA);
        System.out.println("Pole koła: " + cA);
        System.out.println("Obwód trójkąta: " + tP);
        System.out.println("Obwód prostokąta " + rP);


    }
}