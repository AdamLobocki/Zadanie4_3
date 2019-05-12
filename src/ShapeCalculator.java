public class ShapeCalculator {

    double squareArea(Square square){
        double x = square.a * square.a;
        return x;
    }
    double circleArea(Circle circle){
        double x = 3.14 * circle.r;
        return x;
    }

    double trianglePerimeter(Triangle triangle){
        double x = triangle.a + triangle.b + triangle.c;
        return x;
    }
    double rectPerimeter(Rectangle rectangle){
        double x = rectangle.a * 2 + rectangle.b * 2;
        return  x;
    }
}
