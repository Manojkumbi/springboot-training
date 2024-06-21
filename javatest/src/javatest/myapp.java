package javatest;

interface myinterface{
	public void m1();
}


public class myapp implements myinterface {

	public void m1() {
		System.out.println("m1 method");
	}
	public static void main(String[] args) {

		myapp mn=new myapp();
		mn.m1();
		
		

	}

}
