package Conditional.pro;

class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	}

	class Dog extends Animal {
	   public void move() {
	      System.out.println("Dogs can walk and run");
	   }
	   public void bark() {
	      System.out.println("Dogs can bark");
	   }
	}

	public class MethodOverRiding {

	   public static void main(String args[]) {
	      Animal a = new Animal();   // Animal reference and object
	      Animal b = new Dog();   // Animal reference but Dog object

	      a.move();   // runs the method in Animal class
	      b.move();   // runs the method in Dog class
	     
	   }
	}