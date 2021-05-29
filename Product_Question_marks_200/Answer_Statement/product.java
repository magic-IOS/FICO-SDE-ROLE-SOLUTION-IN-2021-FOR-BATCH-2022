import java.io.*;
import java.lang.*;

class product {
    
    public static int fun(int a)
    {
        int sum=0;
        int product=1;
        while(a>0)
        {
            int temp=a%10;
            sum=sum+temp;
            product=product*temp;
            a=a/10;
            
        }
        return (int)Math.abs(product-sum);
       
    }
	public static void main (String[] args) {
	    
	    System.out.println(fun(123456));

	}
}