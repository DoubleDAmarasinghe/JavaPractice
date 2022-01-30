package MainPack;

class Parent1{
	public void myFunction1() {
		System.out.println("This is from Parent1 Class");
	}
}

class Parent2{
	public void myFunction2() {
		System.out.println("This is from Parent2 Class");
	}
}

//Single inheritance
class Child1 extends Parent1{
	public void childFunction1() {
		System.out.println("This is from Child1 Class");
	}
}

//multilevel inheritance
class GrandChild extends Child1{
	
}

interface MyInterface1{
	void interfaceFun1();
}

interface MyInterface2{
	void interfaceFun2();
}

//multiple inheritance
class Child2 implements MyInterface1, MyInterface2{
	public void interfaceFun1() {
		System.out.println("This is the method from interface1");
	}
	
	public void interfaceFun2() {
		System.out.println("This is the method from interface2");
	}
} 

public class Inheritance {

	public static void main(String[] args) {
		//application of single inheritance
		Child1 obj1 = new Child1();
		obj1.myFunction1();
		
		//application of multilevel inheritance
		GrandChild obj2 = new GrandChild();
		obj2.myFunction1();
		obj2.childFunction1();
		
		//application of multiple inheritance
		Child2 obj3 = new Child2();
		obj3.interfaceFun1();
		obj3.interfaceFun2();

	}

}
