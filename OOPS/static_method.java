class Student{
    int id;
    int roll;
    static String name="Pao";
    static void change(){
        name="Par";
    }
    Student(int id, int roll){
        this.id=id;
        this.roll=roll;
    }
    void display(){
        System.out.println(id+" "+roll+" "+ name);
    }

}

public class static_method {

    public static void main(String args[]){
//        Object is not required to call static class/methods
        Student.change();
        Student s1= new Student(11,18);
        s1.display();

    }
}