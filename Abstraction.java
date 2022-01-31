package MainPack;

abstract class Parent11{
	public abstract void myFun();
}

class Child11 extends Parent11{
	public void myFun() {
		System.out.println("This is Java Abstraction");
	}
}

class Child21 extends Parent11{
	public void myFun() {
		System.out.println("This is another Java Abstraction");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Child11 obj1 = new Child11();
		obj1.myFun();
		
		Child21 obj2 = new Child21();
		obj2.myFun();

	}

}
