import java.lang.*;
import java.io.*;
import java.util.*;

 class Maxthreee {
	
	public int a,b,c;
	public Maxthreee(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void factor(int no1,int no2)
	{
		if(no1%no2==0)
		{
			System.out.println("IT IS FACTOR");
		}
		else
		{
			System.out.println("Not factor");
		}
		
	}

	public int max()
	{
		if((a>b)&&(a>c))
		{
			return a;
		}
		else if((b>a)&&(b>c))
		{
			return b;
		}
		else
		{
			return c;
		}
	}
}


public class Maxthree
{
	public static void main(String[] args) {
		System.out.println("Enter three Number");
		Scanner s=new Scanner(System.in);
		
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		Maxthreee o=new Maxthreee(a, b, c);
		
		int result=o.max();
		
		System.out.println("Maximum of three:"+result);
		
		o.factor(10, 5);
				
	
		
		
	}
}











