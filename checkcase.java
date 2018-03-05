import java.lang.*;
import java.io.*;
import java.util.Scanner;

class demo1
{
	public void chkcase(char c)
	{
		if((c>='a')&&(c<='z'))
		{
			System.out.println("lowercase");
		}
		else
		{
			System.out.println("Upeercase");
		}
	}
	
	public void print(int no)
	{
		for(char c='A';c<'A'+no;c++)
		{
		System.out.println(c);	
		}
		
	}
}



public class checkcase {
	public static void main(String[] args) {
		System.out.println("Enter character");
		Scanner s=new Scanner(System.in);
		
		char c=s.next().charAt(0);
		
		demo1 d=new demo1();
		d.chkcase(c);
		
		System.out.println("Enter no less than 26");
		int no=s.nextInt();
		if(no<=26)
		{
			d.print(no);
		}
		else
		{
			System.out.println("PLZ enter no less than 26");
		}
		
	}

}
