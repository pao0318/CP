import java.io.*;
import java.util.*;

public class JZZHU {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n_m = br.readLine().split(" ");
        int n = Integer.parseInt(n_m[0]);
        double m = Double.parseDouble(n_m[1]);

        int[] a = new int[n];
        String[] a_input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(a_input[i]);
            if(a[i]<=m)
                a[i]=0;
        }

        double max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            double x = Math.ceil((a[i]) / m);
            if (x >= max) {
                max = x;
                index = i;
            }
        }

        System.out.println(index+1);
    }
}
