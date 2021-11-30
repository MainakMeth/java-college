//Question 1
interface Shape{
    double pie = 3.14;
}
class Circle implements Shape{
    double area(double r){
        double a = pie * r * r;
        return a;
    }
}
class Rectangle{
    double area(double l, double b){
        double a = l * b;
        return a;
    }
}
class Area{
    public static void main(String[] args){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        System.out.println("The area of circle: "+c.area(3));
        System.out.println("The area of rectangle: "+r.area(3,4));
    }
}