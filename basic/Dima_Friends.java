import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class DimaFriends {
    public static void main(String args[]) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String frnds[]= br.readLine().split(" ");
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=Integer.parseInt(frnds[i]);

        int cntr=0;

        for(int i=1;i<=5;i++){
            if((i+sum)%(n+1)!=1)
                cntr++;
        }
        System.out.println(cntr);
    }
}
