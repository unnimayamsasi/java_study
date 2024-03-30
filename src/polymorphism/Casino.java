package polymorphism;

import java.util.Random;

interface Shapes{
    void display();
}
class DashedLine implements Shapes{
    @Override
    public void display() {
        System.out.println("------------");
    }
}
class StarLine implements Shapes{
    @Override
    public void display() {
        System.out.println("**************");
    }
}
class HashLine implements Shapes{
    @Override
    public void display() {
        System.out.println("##############");
    }
}

public class Casino {
    public static void main(String[] args) {
       Shapes[] shapess={new DashedLine(), new StarLine(),new HashLine()};
        Random random=new Random();
        int index= random.nextInt(shapess.length);
        System.out.println("Welcome to the Casino");
        System.out.println("Your lucky shape is : ");
        shapess[index].display();
    }
}
