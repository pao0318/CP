import java.util.*;

public class LongestLeaf
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        PriorityQueue<Double> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++)
            pq.add((double)arr[i]);

        while(pq.size()>1){
            Double a=pq.poll();
            Double b=pq.poll();
            Double avg=Math.ceil((double)(a+b)/2);
            pq.add(avg);
        }
        System.out.println((int)Math.ceil(pq.poll()));
    }
}
