import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) 
	{
	   HashMap<String,Integer> map=new HashMap<>();
	   String arr12[]={"Liverpool 3:2 PSG","Redstar 0:0 Napoli","PSG 6:1 Redstar","Napoli 1:0 Liverpool"};
	   for(int i=0;i<arr12.length;i++)
	   {
	   String h=arr12[i];
	    String arr[]=h.split(":");
	    String first=arr[0];
	    String second=arr[1];
	    String arr2[]=first.split(" ");
	    String arr3[]=second.split(" ");
	    int v=Integer.parseInt(arr2[1]);
	    int v1=Integer.parseInt(arr3[0]);
	    if(v>v1)
	    {
	        if(map.containsKey(arr2[0]))
	        {
	            map.put(arr2[0],map.get(arr2[0])+3);
	        }
	        else
	        {
	             map.put(arr2[0],3);
	        }
	    }
	    else if(v==v1)
	    {
	        if(map.containsKey(arr2[0]))
	        {
	            map.put(arr2[0],map.get(arr2[0])+1);
	        }
	        else
	        {
	             map.put(arr2[0],1);
	        }
	        if(map.containsKey(arr3[1]))
	        {
	            map.put(arr3[1],map.get(arr3[1])+1);
	        }
	        else
	        {
	             map.put(arr3[1],1);
	        }
	    }
	    else
	    {
	        if(map.containsKey(arr3[1]))
	        {
	            map.put(arr3[1],map.get(arr3[0])+3);
	        }
	        else
	        {
	             map.put(arr3[1],3);
	        }
	        
	    }
	}
 map=sortByValueJava8Stream(map);
 String arr122[]=new String[arr12.length];
 int count=0;
 for(Map.Entry<String,Integer> map33:map.entrySet())
 {
     String temp=map33.getKey()+" "+map33.getValue();
     arr122[count++]=temp;
 }
 for(int i=0;i<arr122.length;i++)
 {
     if(i==0)
     {
          System.out.print("[\""+arr122[i]+"\","); 
     }
     else if(i==arr122.length-1)
     {
        System.out.print("\""+arr122[i]); 
     }
     else
     System.out.print("\""+arr122[i]+"\",");
 }
 System.out.print("\"]");
	}
     private static HashMap sortByValueJava8Stream( HashMap<String,Integer> map) 
    {
         Map<String, Integer> unSortedMap =map;
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
          unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
        return  reverseSortedMap;
    }
}