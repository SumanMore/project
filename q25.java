
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
package code;
public class q25
	
{
	 public static void  main(String args[])
	 {
	 long lcm=1;
	 for(long i=2;i<=20;i++)
	 {
	     lcm=flcm(lcm,i);
	 }
	 System.out.println(lcm);}
static long flcm(long a,long b)	{
long hcf=0,lcm=0,i=1;
long g=a>b?a:b;
while(i<g)
{
    if((a%i==0) && (b%i==0))
        hcf=i;
    i++;
}
lcm=(a*b)/hcf;
return lcm;
}
  }
//output
//232792560
