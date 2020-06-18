//What is the 10 001st prime number?
package code;
public class q7 {

public static void main(String args[])
{int t=3,k=1;
	while(k<10001) { int c=0;
		for(int i=3;i<=t/2;i+=2) {
			if(t%i==0)
			{	c++;break;}}
		if(c==0)
		{
			k++;
		}t+=2;
	}
	System.out.println((t-2));
}
}

//output:
//104743
