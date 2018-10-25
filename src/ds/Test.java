package ds;

//Java program to demonstrate working of newInstance() 

//Sample classes 
class A {  int a; int b; void m1() {} } 
class B {  A m2() {return new A();} void m3() {} } 

public class Test 
{ 
 // This method creates an instance of class whose name is  
 // passed as a string 'c'. 
/* public static void fun(String c)  throws InstantiationException, 
     IllegalAccessException, ClassNotFoundException 
 { 
     // Create an object of type 'c'  
     Object obj = Class.forName(c).newInstance(); 

     // This is to print type of object created 
     System.out.println("Object created for class:"
                     + obj.getClass().getName()); 
 } 
*/
 // Driver code that calls main() 
 public static void main(String[] args) 
 { 
	 
	A a1=new B().m2();
	
   //This is jeeva editing   
 }    
} 