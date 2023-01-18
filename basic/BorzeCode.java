import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder res = new StringBuilder();
        int n=s.length();
   
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            
            if(c=='.')
                res.append('0');
            else if(c=='-'){
                if(i+1<n && s.charAt(i+1)=='.'){
                    res.append('1');
                }
                else{
                    res.append('2');
                }
                i++;
            }
        }
        System.out.println(res);
       
        
      
    }
}
