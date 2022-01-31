package MainPack;

//this is the abstract class
abstract class Parent11{
	public abstract void myFun();  //this call pure virtual or abstract function
	
	public void myFun2() {
		System.out.println("This is a normal function");
	}
}

class Child11 extends Parent11{
	//implementation of virtual or abstract function
	public void myFun() {
		System.out.println("This is Java Abstraction");
	}
}

class Child21 extends Parent11{
	//implementation of virtual or abstract function
	public void myFun() {
		System.out.println("This is another Java Abstraction");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Child11 obj1 = new Child11();
		obj1.myFun();
		obj1.myFun2();
		
		Child21 obj2 = new Child21();
		obj2.myFun();

	}

}
