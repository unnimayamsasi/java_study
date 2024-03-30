package polymorphism;

//define shape interface
interface Shape{
    void draw();
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("I am Circle");
    }
}
class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("I am Triangle");
    }
}
class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("I am Square");
    }
}
public class ShapeDraw {
    public static void main(String[] args) {
        //object
        Shape circle=new Circle();
        Shape triangle=new Triangle();
        Shape square=new Square();
        circle.draw();
        triangle.draw();
        square.draw();
    }
}
