package Conditional.pro;

public class Exception {
	
public static void main(String[] args) {
		 //TODO Auto-generated method stub

	      try {
	         int a[] = new int[2];// assign a variable
	         System.out.println("Access element three :" + a[3]);
	      }
	      catch (ArrayIndexOutOfBoundsException e) 
	      {
	         System.out.println("Exception thrown  :" + e);
	      }
	      System.out.println("Out of the block");//print the statement
	   }
	}