package operators;

public class BitWiseOperators {
	public static void main(String[] args) {
		byte val1 = 12;  //0000 1100
		byte val2 = 10;  //0000 1010
		byte res;
		
		
		//Negation
		System.out.println("Negation:");
		System.out.println("For some reason that I still do not understand, if we negate (~ -> Alt+126) the binary value of one byte type variable, it becomes negative and increment the value by 1:");
		res = (byte) ~val1;  
		System.out.println("Val 1 = 12\nVal 1 negated = "+res);
		System.out.println("Superficial explanation in binary:"
				+ "\n12 -> 0000 1100 "
				+ "\n12 = 8 + 4 -> 1111 0011 "
				+ "\n-(0000 1100 + 1) -> -(12+1) = -13  ");
		
		//AND
		System.out.println("\nbitwise AND operator: ");
		res = (byte) (val1 & val2);
		System.out.println("The result of byte 1 & byte 2 is "+res);
		
		//OR
		System.out.println("\nbitwise OR operator: ");
		res = (byte) (val1 | val2);
		System.out.println("The result of byte 1 | byte 2 is "+res);
		
		//XOR
		System.out.println("\nbitwise XOR operator: ");
		res = (byte) (val1 ^ val2);
		System.out.println("The result of byte 1 ^ byte 2 is "+res);
		
		//Shift to Left
		System.out.println("\nShift bits to left: ");
		res = (byte) (val1 << 2);
		System.out.println("Here we are shifting 2 bits to the left:"
				+ "\nOriginal Val1 = 0000 1100"
				+ "\nVal1 with 2 bits to the left -> 0011 0000 = "+res);
		
		//Shift to Right
		System.out.println("\nShift bits to right: ");
		res = (byte) (val1 >> 2);
		System.out.println("Here we are shifting 2 bits to the right:"
				+ "\nOriginal Val1 = 0000 1100"
				+ "\nVal1 with 2 bits to the right -> 0000 0011 = "+res);
		
		
	}
}
