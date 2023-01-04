import java.util.*;
class Queue{
    int start;
    int end;
    int curr_size;
    int max_size=1000;
    int []arr= new int[max_size+1];

    Queue(){
        start=-1;
        end=-1;
        curr_size=0;
    }


    int getSize(){
        return size-push_ptr;
    }
    void push(int ele){
            if(curr_size==max_size){
                System.out.println("Overflow");
                System.exit(1);
            }

           if(end==-1){
               start=0;
               end=0;
           }
           else
               end=(end+1)%max_size;
           arr[end]=ele;
           System.out.println("Pushed into queue"+ele);
           curr_size++;
    }


    void poll(){
            if(start==-1){
                System.out.println("Empty");
                System.exit(1);
            }
            int x=arr[start];

            System.out.println("Popped element is"+ x);

    }

    void peek(){
        System.out.println("Top element is "+arr[push_ptr]);
    }
    void isEmpty(){
        if(getSize()==0)
            System.out.println("Empty");
        else
            System.out.println("Not empty");
    }
}



public class queue_using_Array {
    public static void main(String args[]){
        Queue pq=new Queue();
        pq.push(10);
        pq.push(20);
        pq.push(30);
        pq.poll();
        pq.getSize();
        pq.peek();
        pq.isEmpty();

    }
}