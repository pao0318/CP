import java.util.*;
import java.io.*;
class SCi{
    public static void main(String args[]) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t-->0){
            String x[]=br.readLine().split(" ");
            String y[]=br.readLine().split(" ");
            String z[]=br.readLine().split(" ");

            int xg=Integer.parseInt(x[0]+y[0]+z[0]);
            int yg=Integer.parseInt(x[1]+y[1]+z[1]);
            int zg=Integer.parseInt(x[2]+y[2]+z[2]);
            if(xg==0 && yg==0 && zg==0)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }
}