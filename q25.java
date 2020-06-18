
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
package code;
public class q25
	{public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		long a = lcm(ar);
		System.out.println(a);
}
	static long lcm(int arr[])
	{
		long l=1;
		int d=2;
		while (true)
		{
			int c=0;boolean b=false;
			for (int i=0;i<arr.length;i++)
			{
			if(arr[i]==1)
					c++;
				if(arr[i]%d==0)
				{
					b=true;
					arr[i]=arr[i]/d;
				}}
			if(b)
				l=l*d;
			else 
				d++;
			if(c==arr.length)
				return l;
			
		}}}
		
//output
//232792560
