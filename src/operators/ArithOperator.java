package operators;

import java.util.Scanner;

public class ArithOperator {
	public static void main(String[] args) {
	int a, b, result;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the value of a: ");
	a = scanner.nextInt();
	System.out.println("The value of a is "+a);
	System.out.println("Enter the value of b: ");
	b = scanner.nextInt();
	System.out.println("The value of b is "+b);
	
	//Addition:
	result = a+b;
	System.out.println("Addition: ");
	System.out.println(a +" + "+ b +" = "+ result);
	
	
	//Substraction:
	result = a-b;
	System.out.println("Substraction: ");
	System.out.println(a +" - "+ b +" = "+ result);
	
	//Multiplication:
	result = a*b;
	System.out.println("Multiplication: ");
	System.out.println(a +" * "+ b +" = "+ result);
	
	//Division:
	result = a/b;
	System.out.println("Division: ");
	System.out.println(a +" / "+ b +" = "+ result);
	
	//Remainder:
	result = a%b;
	System.out.println("Remainder: ");
	System.out.println(a +" % "+ b +" = "+ result);
	}
}
