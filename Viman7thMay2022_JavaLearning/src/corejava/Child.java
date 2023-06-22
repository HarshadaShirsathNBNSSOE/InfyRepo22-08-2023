package corejava;

public class Child extends Parent {
	
	
	
 public	static void m1()
 {
	 System.out.println("child method");
 }
	
	public static void main(String [] args)
	{
		Parent.m1();
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}
