import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class table {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner s=new Scanner(System.in);

		int no=s.nextInt();
		System.out.println("Table of:"+no);
		for(int i=1;i<=10;i++)
		{
			System.out.println(no*i); 
		}
	}

}
