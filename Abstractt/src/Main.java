
abstract class A {

	void meth () {
		System.out.println("non static ");
	}
	static void meth2() {
		System.out.println("static ");
	}
	abstract void meth3();
	
}

interface C{
	
	public static final int a = 10;
	
	void meth4(int a , int b);
	
	
}


class B extends A implements C{
	
	@Override
	void meth3() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void meth4(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Main {
	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(B.a);
		
		
	}
}
