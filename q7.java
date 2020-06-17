//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?
package code;
public class q7 {

public static void main(String args[])
{
	int f=1,t=0,p=1;
    for(int x=3;x>0;x+=2)
    { 
        for(int y=3;y<=Math.sqrt(x);y+=2)
        {
            if(x%y==0)
            {
                t=1;
             }
         }
         if(t==0)
         {
             p++;               
             if(p==10001)
              {
               System.out.println(x);
                break;
               }            
         }
         t=0;
    }
  }
}

