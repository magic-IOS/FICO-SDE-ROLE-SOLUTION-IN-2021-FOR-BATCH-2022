import java.io.*;
import java.lang.*;

class adjacent {
    
    public static int fun(String a)
    {
        char a1[]=a.toCharArray();
        int count=0;
        for(int i=0;i<a1.length-2;i++)
        {
            int z1=(int)a1[i];
            int z2=(int)a1[i+1];
            int z3=(int)a1[i+2];
            if((z3-z2)==(z2-z1))
            {
                count++;
            }
        }
        return count;
    }
	public static void main (String[] args) {
	    
	    System.out.println(fun("abcdaaae"));

	}
}