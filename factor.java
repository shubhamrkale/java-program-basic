import java.util.*;
import java.io.*;

class demo
{
	public void fact(int no1)
	{
		if(no1<1)
		{
			return;
		}
		
		
		System.out.println("Factor are:");
		for(int icnt=1;icnt<=no1/2;icnt++)
		{
			if(no1%icnt==0)
			{
				System.out.println(icnt);
			}
		}
	}
	
	public int sumfact(int no1)
	{
		int isum=0;
		for(int icnt=1;icnt<=no1/2;icnt++)
		{
			if(no1%icnt==0)
			{
				isum=isum+icnt;
			}
		}
		return isum;
	}
}







public class factor {
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int no1=s.nextInt();
	demo d=new demo();
	d.fact(no1);
	
	int result=d.sumfact(no1);
	System.out.println("Addition of factor:"+result);
}	

}
