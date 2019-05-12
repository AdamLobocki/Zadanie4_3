public class Triangle {
    double a, b, c;
    Triangle(double bokA, double bokB, double bokC){
        a = bokA;
        b = bokB;
        c = bokC;
    }
    double trianglePerimeter(){
        double x = a + b + c;
        return x;
    }
}
