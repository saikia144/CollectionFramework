//In Java, non-static inner classes have access to the member variables of the outer class because they are intimately connected 
//with the instance of the outer class. When an instance of the inner class is created, it holds a reference to the outer class instance that created it.
//This access is possible due to a feature called "lexical scoping" or "lexical scoping rules". Lexical scoping means that inner classes can access 
//variables and methods of their enclosing class, including its instance variables.
//
//When the inner class is defined within the outer class, it becomes a member of the outer class itself. As a result, the inner class can access both 
//the static and non-static members of the outer class, just like any other member of the outer class would be able to.
//
//This access to the outer class's member variables allows the inner class to operate on and manipulate the state of the outer class, 
//providing a way to encapsulate related functionality within the context of the outer class.
//
//It's worth noting that this access is limited to the instance variables of the outer class and not the local variables or method parameters
//of methods within the outer class. For the inner class to access local variables or method parameters, they need to be declared as final or effectively 
//final.



package com.mapDemo;

class outer{
	String name = "Outer class";
	static String hobby = "Sports";
	
	void disp() {
		System.out.println("This is a outer class method");
	}
	public class inner{
		void msg() {
			System.out.println("This is an inner class and name:" + name);
			System.out.println("Hobby is "+hobby);
			disp();
		}
	}
	
	public static class s_inner{
		String name1  = "static inner class";
		static String hobby = "coding";
		void msg() {
			System.out.println("This is an static inner class "+name1); //change it to 'name' and see.** Compile time error
			System.out.println("Hobby is "+hobby);
		}
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		outer o = new outer();
		o.new inner().msg();
		System.out.println(o.new inner());
		
//In Java, you cannot store a reference to a non-static inner class in a variable of the outer class's type because the non-static inner class
//requires an instance of the outer class to be instantiated.In the case of a non-static inner class, it is intimately tied to an instance of the outer 
//class. Each instance of the non-static inner class is associated with a specific instance of the outer class. 
//This association allows the inner class to access the instance variables and methods of the outer class.
//
//When you want to create an instance of a non-static inner class, you need an instance of the outer class first. 
//You cannot directly instantiate the inner class without an instance of the outer class. Therefore, you cannot store the reference of a non-static 
//inner class in a variable of the outer class's type because it would not be a valid reference.
//
//On the other hand, a static inner class is not tied to any specific instance of the outer class. 
//It can be instantiated independently without requiring an instance of the outer class. 
//That's why you can store the reference of a static inner class in a variable without the need for an instance of the outer class.		
		outer.s_inner s_inner = new outer.s_inner();
		s_inner.msg();
		System.out.println(new outer.s_inner());
		
	}
}
