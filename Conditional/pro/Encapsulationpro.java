package Conditional.pro;

public class Encapsulationpro {

	public static class Encapulation {
		private String Empname;//Declare variable
		private int  Empid;
		private int Empage;

		public String getEmpname(){
			return Empname;
		}
		public int getEmpid(){
			return Empid;
		}
		public int getEmpage(){
			return Empage;
		}
		public void setEmpname(String newValue){
			Empname = newValue;
		}
		public void setEmpid(int newValue){
			Empid = newValue;
		}
		public void setEmpage(int newValue){
			Empage = newValue;
		}


		public static void main(String args[]){
			Encapulation obj=new Encapulation();
			obj.setEmpname("raja");
			obj.setEmpid(1210);
			obj.setEmpage(25);
			System.out.println("Employee name:+obj.getEmpname");
			System.out.println("Employee id:+obj.getEmpid");
			System.out.println("Employee age:+obj.getEmpage");
		}
		
	}
	}




