//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?
package code;
public class q7 {

public static void main(String args[])
{
int i,j,c=0,c1=0;
		for(i=1;;i++)
		{ c=0;
			for(j=1;j<=i;j++)
			{
			if(i%j==0)
			{
				c++;
			}
		}
			if(c==2)

				c1++;

			if(c1==10001)
				break;
	}
		System.out.println("the 10001st prime number ="+i);	
  }
}
//output:
//the 10001st prime number =104743
