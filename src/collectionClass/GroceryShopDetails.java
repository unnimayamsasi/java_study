package collectionClass;

import java.util.ArrayList;

class ConsmerProduct{
    private int id;
    private String name;
    private double price;

    public ConsmerProduct(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
public class GroceryShopDetails {
    public static void main(String[] args) {
        ArrayList <ConsmerProduct>products= new ArrayList<>();
        products.add(new ConsmerProduct(100,"Egg",2.50));
        products.add(new ConsmerProduct(101,"Milk",4.00));
        products.add(new ConsmerProduct(102,"Bread",2.00));
        int SearchId=101;
        boolean found=false;
        for (ConsmerProduct product : products){
            if (product.getId()== SearchId){
                System.out.println("Product found : " +product.getName()+ ",$" + product.getPrice());
                found=true;
                break;
            }
        }
        if (!found){
            System.out.println("Not found");
        }

    }
}
