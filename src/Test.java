public class Test {
    public static void main(String[] args) {


        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(5, 7, 234);

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        double sA = shapeCalculator.squareArea(square);
        double cA = shapeCalculator.circleArea(circle);
        double tP = shapeCalculator.trianglePerimeter(triangle);
        double rP = shapeCalculator.rectPerimeter(rectangle);

        System.out.println("Pole kwadratu: " + sA);
        System.out.println("Pole koła: " + cA);
        System.out.println("Obwód trójkąta: " + tP);
        System.out.println("Obwód prostokąta " + rP);


    }
}