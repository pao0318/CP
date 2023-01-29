import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class EffectiveApproach {
    public static void main(String args[]) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String []w= br.readLine().split(" ");
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<w.length;i++)
            map.put(Integer.parseInt(w[i]), i+1);

        int qn=Integer.parseInt(br.readLine());
        String []quer=br.readLine().split(" ");

        long sumvyas=0;
        long petyas=0;
        for(int i=0;i<qn;i++){
            int dig=Integer.parseInt(quer[i]);
            sumvyas+=map.get(dig);
            petyas+=((n+1)-map.get(dig));
        }
        System.out.println(sumvyas+ " "+ petyas);

    }
}
