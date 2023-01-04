public class Copy_without_constructor {
    int id;
    String name;
    Copy_without_constructor(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    Copy_without_constructor(){

    }


    public static void main(String args[]){
        Copy_without_constructor a= new Copy_without_constructor(111,"Pao");
        Copy_without_constructor b=new Copy_without_constructor();
        b.id=a.id;
        b.name=a.name;
        a.display();
        b.display();
    }
}