package com.FirstClass;

public class FirstClass {
	/*
	 * Ctrl+Shift+O - to remove the unused imports Ctrl+Shift+F - format the
	 * code Ctrl+Shift+/ - comment multiple lines variables int- 32 bit short-
	 * 16 bits long- 64 bits float and double for decimals float-32 bits double
	 * -64 bits char- character boolean- true or false String -is not primitive
	 * variable but works same as variables
	 * Ctrl+cursor- goes into the method
	 */
	public static void main(String[] args) {
		/* System.out.println("Hello world"); */
		int t = 5;
		/*
		 * if(t==2){ System.out.println("Value of t is : "+t); } else{
		 * System.out.println("Value of t is : "+t); }
		 */
		switch (t) {
		case 2:
			System.out.println(" I am two");
			break;
		case 3:
			System.out.println(" I am three");
			break;
		case 4:
			System.out.println("I am four");

			break;

		default:
			System.out.println(" I am default");
			break;
		}
		firstMethod();
		int x=secondMethod();
		System.out.println("X is :"+x);
		String var2= thirdMethod(" Hello","there");
		System.out.println(var2);
	}
	private static String thirdMethod(String a, String b) {
		return a+" "+b;
	}
	private static int secondMethod() {
 return 2;		
	}
	private static void firstMethod(){
		System.out.println("I am from first method");
	}

}
