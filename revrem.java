import java.util.Scanner;
public class revrem{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='a' ||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
            sb.deleteCharAt(i);
        }
        System.out.println(sb);
    }
}
