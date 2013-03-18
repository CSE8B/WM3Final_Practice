
public class Fundamental {

	
	public static void main(String[] args) {
		System.out.println(Math.pow(4, 1 / 2));
		int x = 1;
		x *= x+1;
		System.out.println(x);
		int y = 1 * x++ * (x+1) * ++x * (++x+1) * --x / 2 * --x*(-10);
		System.out.println(y);
		
		
		/*
		 * Operands are evaluated from left to right in Java. 
		 * The left-hand operand of a binary operator is evaluated 
		 * before any part of the right-hand operand is evaluated. 
		 * This rule takes precedence over any other rules that govern expressions. 
		 */
		int j = 0;
	    int i = ++j + j * 5;

	    System.out.println("What is i? " + i);
	    System.out.printf("what 's the int? %3d and the string %-5s and char %c",20,"Hi", 'a');
	    System.out.println();

	}

}
