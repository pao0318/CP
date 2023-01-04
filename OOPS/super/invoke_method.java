class Animal{
    void eat(){
        System.out.println("This is super eating");
    }
}
class Jack extends Animal{
    void disp(){System.out.println("This is child disp");}
    void eat(){System.out.println("This is child eat");}
    void work(){
        super.eat();
    }
}

public class invoke_method {
    public static void main(String []args){
        Jack obj= new Jack();
        obj.disp();
        obj.eat();
        obj.work();
    }
}