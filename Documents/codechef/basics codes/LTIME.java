/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0; i<t; i++)
		{
		   
		    int n=sc.nextInt();
		    if(n>=1&&n<=4)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
