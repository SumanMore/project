
//Pythagorean triplet
package code;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0,s=1000;
	    int ctr=0;
	    for(a=1;a<s/3;a++)
	    {
	        for(b=a;b<s/2;b++)
	        {
	            c=s-a-b;
	            if(a*a+b*b==c*c)
	            {
	                ctr++;
	                break;
	            }
	        }
	        if(ctr>0)
	        {
	          break;
	        }
	    }
	    System.out.println(a*b*c);
	}
	}
//output:
//31875000
