import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class panagram {
public static void  main(String args[])
{
	String str;
	Scanner s=new Scanner(System.in);
	str=s.nextLine();
	str=str.toUpperCase();
	char[] str1=str.toCharArray();
	Set <Character> s1=new HashSet<Character>(str1.length);
	for(int i=0;i<str1.length;i++)
	{
		if(str1[i]!=' ')
		s1.add(str1[i]);
	}
	if(s1.size()==26)
	{
		System.out.print("PANAGRAM");
	}
	else
		System.out.print("NOT A PANAGRAM");
}
}
