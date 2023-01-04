import java.util.*;
class Stack{
static final int size=1000;
int top;
int arr[]= new int[size];

Stack(){
    top=0;
}

    void push(int ele){
    if(top>=size-1){
        System.out.println("Stack overflow");
        return;
    }
    arr[top++]=ele;
    System.out.println("Pushed "+ele);
    }
    int poll(){
    if(top<0){
        System.out.println("Stack underflow");
        return 0;
    }
    int x=arr[top--];
    top--;
    return x;


    }
    boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    int peek(){
    return arr[top];
    }

}

public class stack_using_queue {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Stack s= new Stack();
        s.push(10);
        s.push(20);
        s.poll();
        System.out.println(s.peek());



    }






}
