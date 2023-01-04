class Student{

    Student(){
        System.out.println("Mai default");
    }
    Student(int id,int roll, String name){
        this();
        System.out.println("This is parameterised constructor"+" "+id+" "+roll+" "+ name);
    }
}
public class default_C_from_param_C {
    public static void main(String args[]){
        Student s= new Student(10,18,"Pa");
    }

}

class Student{

    Student(int id,int roll, String name){
        System.out.println("This is parameterised constructor"+" "+id+" "+roll+" "+ name);
    }

    Student(){
        this(10,18,"PA");
        System.out.println("Mai default");
    }

}
public class default_C_from_param_C {
    public static void main(String args[]){
        Student s= new Student();
    }

}