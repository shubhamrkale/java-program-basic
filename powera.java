import java.io.*;
import java.util.*;
import java.io.*;
public class powera {
	public static void main(String[] args) {
		int no1,no2;
		System.out.println("Enter two number:");
		Scanner s=new Scanner(System.in);
		no1=s.nextInt();
		no2=s.nextInt();
		int po=1;
		for(int i=1;i<=no2;i++)
		{
			 po=po*no1;
		}
		
		System.out.println("Answer is"+po);
		
		System.out.println("ASCII value and SYMBOL");
		for(int icnt=0;icnt<=255;icnt++)
		{
			System.out.printf("%d",icnt);
			System.out.println("\t");
			System.out.printf("%c",icnt);
		}
	}

}
