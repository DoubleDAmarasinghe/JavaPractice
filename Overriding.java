package MainPack;

class Parent{
	public void Myfun() {
		System.out.println("This is overridden Class");
	}
}

//method override
class Child extends Parent{
	@Override
	public void Myfun() {
		super.Myfun();
		System.out.println("The method has been overrided");
	}
}

public class Overriding {
	public static void main(String []args) {
		Child obj1 = new Child();
		obj1.Myfun();
		
		//call overriden method
		Parent obj2 = new Parent();
		obj2.Myfun();
	}
}
