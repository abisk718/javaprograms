package Conditional.pro;

public class Singleton {



	    private static Singleton myObj;
	    /**
	     * Create private constructor
	     */
	    private Singleton(){
	         
	    }
	    /**
	     * Create a static method to get instance.
	     */
	    public static Singleton getInstance(){
	        if(myObj == null){// if condition apply
	            myObj = new Singleton();
	        }
	        return myObj;
	    }
	     
	    public void getSomeThing(){
	   
	        System.out.println(" Get result ");   // print the statement
	    }
	     
	    public static void main(String a[]){
	        Singleton st = Singleton.getInstance();//method calling
	        st.getSomeThing();
	    }
	
	}


