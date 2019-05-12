public class Rectangle {

    double a;
    double b;
    Rectangle(double bokA, double bokB){
        a = bokA;
        b = bokB;
    }
    double rectPerimeter(){
        double x = a * 2 + b * 2;
        return  x;
    }
}
