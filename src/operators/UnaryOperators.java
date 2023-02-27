package operators;

public class UnaryOperators {
	public static void main(String[] args) {
		int var1, var2;
		var1 = 50;
		
		var2 = -var1;
		System.out.println("Variable 1 = " + var1 + "\nVariable 2 = "+var2);
		System.out.println("Unary operator '-' to invert the sign of value of variable 2");
		
		//Increment:
		
		//Post Increment:
		var1=50;
		var2 = var1++;
		System.out.println("Unary opertor '++' after var1, post incremnting, store previous value on var2, then incrased var1 by 1");
		System.out.println("Variable 1 = "+ var1 +  "\nVariable 2 = "+var2);
		
		//Pre Increment:
		var1=50;
		var2 = ++var1;
		System.out.println("Unary opertor '++' before var1, pre incremnting, incrased var1 by 1, then assign to var2");
		System.out.println("Variable 1 = "+ var1 +  "\nVariable 2 = "+var2);
		
		//Decrement:
		
		//Post Decrement:
		var1=50;
		var2 = var1--;
		System.out.println("Unary operator '--', post decrementing, store previous value on var2, then decrased var1 by 1");
		System.out.println("Variable 1 = "+var1+"\nVariable 2 = "+var2);
	
		//Pre Decrement:
		var1=50;
		var2 = --var1;
		System.out.println("Unary operator '--', pre decrementing, decreased var1 by 1, then assign it to var2");
		System.out.println("Variable 1 = "+var1+"\nVariable 2 = "+var2);
		
		
		//Binary Operators:
		boolean bool1, res;
		bool1 = true;
		
		res = !bool1;
		System.out.println("The value of Bool 1 is "+bool1);
		System.out.println("The value of Res is "+res+", the negation (!) of bool1");
	}
}
