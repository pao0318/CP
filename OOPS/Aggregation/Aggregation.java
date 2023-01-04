class Operation{
    int square(int r){
        return r*r;
    }
}
class Circle{
//    Defining other class object in class
    Operation op;
    double pi=3.14;
    double area(int r){
        Operation op1= new Operation();
        return pi*op1.square(r);
    }
}

public class Aggregation{
    public static void main(String args[]){
        Circle c= new Circle();
        System.out.println(c.area(5));
    }
}