package MainPack;

class MyClass{
	public void myFun() {
		System.out.println("My age is 24");
	}
	
	//method overloading
	public void myFun(int age) {
		System.out.println("My age is: " + age);
	}
}

public class Overloading {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.myFun();
		obj.myFun(24);

	}

}
