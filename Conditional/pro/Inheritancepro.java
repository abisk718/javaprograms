package Conditional.pro;

public class Inheritancepro {

	public class Inheritance {
		
	}public static class Calculation {
		   int z;//variable declare
			
		   public void addition(int x, int y) {
		      z = x + y;//adding x,y
		      System.out.println("The sum of the given numbers:"+z);//print the statement
		   }
			
		   public void Subtraction(int x, int y) {
		      z = x - y; //subtraction x,y
		      System.out.println("The difference between the given numbers:"+z);//print the statement
		   }
	
		
		   public void multiplication(int x, int y) {
		      z = x * y;//multiplication x,y
		      System.out.println("The product of the given numbers:"+z);//print the statement
		   }
			
		   public static void main(String args[]) {
		      int a = 20,  b = 10;//variable initialisation
		      Calculation demo = new Calculation();
		      demo.addition(a, b);
		      demo.Subtraction(a, b);
		      demo.multiplication(a, b);
		   }
	}
}

		