package ds;

import java.util.*;

public class TestProject {

	
  public static double findAngleInClock(int Hours,int Minutes)
  {
	  
	  double degreeHour=0,degreeMin=0,degree=0;
	  
	  degreeHour=(Hours*360/12 )+(Minutes*360/(12*60));
	  degreeMin=(Minutes*360/60);
	  
	  
	  degree=Math.abs(degreeHour-degreeMin);
	  
	  if (degree>180.0)
	  {
		  degree=360-degree;
	  }
	  	  
	  return degree;
	  
  }
	
	
	static int addWithoutOperator(int a, int b)
	{
		if(b==0)
		{
			return a;
		}
		
		int sum=a^b;
		int carry=(a&b)<<1;
		
		return add(sum,carry);
	}
	
	
	static int findDuplicate(int[] A)
			{
		
		       int xor=0;
		       
		       for(int i=0;i<A.length;i++)
		       {
		    	   xor=xor^A[i];
		       }
		
		       for(int i=1;i<=A.length-1;i++)
		       {
		    	   xor=xor^i;
		       }
		
				return xor;
		
		     
			}
	
	static double CDbl(String number)
	{
		
		
		
		
		
		return 0;
		
	}
	
	
	
	
	private static int add(int sum, int carry) {
		// TODO Auto-generated method stub
		return 0;
	}


	static int parseInteger(String number)
	{
		
		char[] numArray;
		int num=1;
	
		if (number.startsWith("-")==true)
		{
			numArray=number.substring(1).toCharArray();
			num=-1;
		}
		else
		{
		   numArray=number.toCharArray();
		}
		
		int Sum=0;
	
		for(int i=0;i<numArray.length;i++)
		{
			
			
			Sum=(Sum*10)+ ((int)numArray[i]-(int)'0');
			
			
		}
		
		
		
		return Sum*num;
		
	}
	
	
	static int parseDouble(String number)
	{
		char[] numArray;
		int num=1;
		System.out.println(number.startsWith("-"));
		if (number.startsWith("-")==true)
		{
			
	
			numArray=number.substring(1,number.indexOf(".")).toCharArray();
			num=-1;
		}
		else
		{
		   numArray=number.toCharArray();
		}
		
		int Sum=0;
	 
		for(int i=0;i<numArray.length;i++)
		{
			
			
			Sum=(Sum*10)+ ((int)numArray[i]-(int)'0');
			
			
		}
		
		
		
		return Sum*num;
		
	}
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		//int []k= {5,4,6,6,7};
		//System.out.println("The degree is " + findAngleInClock(9,0));
		//System.out.println("sum is "+ addWithoutOperator(52,5));
		//System.out.println("Duplicate is "+ findDuplicate(k));
		
		char testarray[]= {'h','e','l','l','o'};
		System.out.println(testarray);
		String s= new String(testarray);
		System.out.println(s);
		
		for (int i=0;i<s.length();i++)
		{
			//System.out.println(s.charAt(i));
			//System.out.println(s.substring(0,2));
			//System.out.println(s.toCharArray()[2]);
			//System.out.println(s.lastIndexOf("l"));
			//System.out.println(s.startsWith("h"));
			//System.out.println(String.valueOf("1")*String.valueOf("2"));
			
			
			
			
			
		}
		
		
		//System.out.println(parseInteger("-120.5"));
		
		Map <String,String> myMap=new HashMap<String,String>();
		
		myMap.put("Jeeva", "Test");
		myMap.put("Jeeva1", "Test1");
		myMap.put("Jeeva2", "Test2");
		myMap.put("Jeeva3", "Test3");
		
		System.out.println("Test this " + myMap.get("Jeeva"));
		
		for (Map.Entry m:myMap.entrySet())
		{
			System.out.println("Value"+m.getKey());
		}
		
		
		int arr[]= {5,2,3,2,1};
		
		int arr2[];
		
		
		arr2=arr;
		
		System.out.println(arr2[0]);
		 
		
		
		
	}
	
	
}
