class Clone{
    int id;
    String name;
    String child;

    Clone(int i,String nm,String ch){
        id=i;
        name=nm;
        child=ch;
    }

    Clone(Clone c){
        id=c.id;
        name=c.name;
    }
    void display(){
        System.out.println(id+" "+ name+" "+child);
    }


    public static void main(String args[]){
        Clone a=new Clone(111, "Pao","pA");
        Clone b= new Clone(a);
        a.display();
        b.display();

    }
}