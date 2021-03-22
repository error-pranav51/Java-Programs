abstract class Shape{
    String color;
    abstract double area();
    abstract String display();

    Shape(String newColor)
    {
        System.out.println("Shape constructor");
        this.color = newColor;
    }
}

class Circle extends Shape{
    double radius;

    Circle(String newColor, double newRadius){
        super(newColor);
        System.out.println("Circle constructor");
        this.radius = newRadius;
    }

    double area(){
        return Math.PI*Math.pow(radius, 2);
    }

    String display(){
        return "Circle has "+super.color+" and area is :- "+area();
    }
}

class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(String newColor, double newLength, double newWidth){
        super(newColor);
        System.out.println("Rectangle Constructor");
        this.length = newLength;
        this.width = newWidth;
    }
    double area(){
        return length*width;
    }

    String display(){
        return "Rectangle has "+super.color+" and area is :- "+area();
    }
}

class AbstractClass1 {
    public static void main(String[] args) {
        Circle c1 = new Circle("Red",2);
        Rectangle r1 = new Rectangle("Blue", 10, 5);
        System.out.println(c1.display());
        System.out.println(r1.display());
    }
}
