package Conditional.pro;

class MethodOverLoading{
	
	  void sum(int a,int b)//Declare variable
	  {
		  System.out.println(a+b);//print the statement 
		  }
	  void sum(int a,int b,int c)//sum=a+b+c;
	  {
		  System.out.println(a+b+c);//print the statement
	  }

	  public static void main(String args[]){
	  MethodOverLoading obj=new MethodOverLoading();//method calling 
	  obj.sum(15,225);//a,b value assign
	  obj.sum(10,30,20);//a,b,c value assign

	  }
	}


