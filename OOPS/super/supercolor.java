class Animal{
  Animal(){
      System.out.println("This is invoked");
  }
    String color="white";
}
class Panther extends Animal{
    String color="black";

    void display(){
        System.out.println("Color of the animal is:"+color);
        System.out.println("Color of superclass is:"+super.color);
    }
}

public class supercolor {
    public static void main(String args[]){
        Panther p= new Panther();
        p.display();
    }
}