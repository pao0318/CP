import java.util.*;
public class longest_substring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        int n=str.length();

        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            int len1=expand(str,i,i);
            int len2=expand(str,i,i+1);

            int len=Math.max(len1,len2);

            if(len>end-start+1){
                start=i-(len-1)/2;
                end=i+(len)/2;
            }
        }

        System.out.println(str.substring(start,end+1));
    }


    public static int expand(String str, int left, int right){
        int start=left;
        int end=right;
        int n=str.length();

        while(start>=0 && end<n && str.charAt(start)==str.charAt(end)){
            start--;
            end++;
        }
        return end-start-1;
    }
}