import java.util.Scanner;
public class chara{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
char c=s.nextCharacter();
if(Character.isLetter(c))
System.out.print(c+" "+"is a Character");
else
System.out.print(c+" "+"is not a Character");
