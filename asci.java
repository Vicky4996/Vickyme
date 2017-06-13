import java.util.Scanner;
class asci{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String s1=s.next();float avg=(float)(s1.charAt(0));
for(int i=1;i<=s1.length();i++)
{
byte[] b1=s1.getBytes();
avg=(float)(avg*(i-1)+b1[i])/(i+1);
}
System.out.println((char)(byte)avg);
}}
