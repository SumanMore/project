
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
package code;
public class q25
	{public static void main(String[] args) {	// TODO Auto-generated method stub
		for(int k=20;k>=1;k+=20) {
			if(divisiable(k)) {
				System.out.println(k);
				break;
			}}}
		
private static boolean divisiable(int a)
{int ctr=0,j;
		for( j=1;j<=20;j++) {
			if(a%j==0) 
				ctr++;
			}if(ctr==20)
			return true;
		else 
			return false;
	}
}	
//output
//232792560
