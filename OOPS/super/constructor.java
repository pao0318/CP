class Animal{
    void display(){
        System.out.println("animal is created");
    }
}
class Dog extends Animal{
    void display(){
        System.out.println("dog is created");
    }
}
class constructor{
    public static void main(String args[]){
        Dog d=new Dog();
        d.display();
    }}