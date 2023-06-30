/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0; i<t; i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    if(a<b&&b<c)
		    {
		        System.out.println("YES");
		    }
		    else   
		    {
		    System.out.println("NO");
	     	}
		}
	}
}
