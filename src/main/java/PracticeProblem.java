import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String hello = in.nextLine();
		System.out.println(Integer.parseInt(5 + hello) + 5);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String ohhh = in.nextLine();
		System.out.println(Double.parseDouble(4 + ohhh + 3) + 3.4);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String hi = in.nextLine();
		System.out.println(!(Boolean.parseBoolean(hi)));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num = in.nextLine();
		int aaa = (Integer.parseInt(num + 3)) + 2;
		System.out.println((char)aaa);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num1 = in.nextLine();
		int bbb = (Integer.parseInt(num1 + 1)) / 2;
		System.out.println((double)bbb);
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num2 = in.nextLine();
		double ccc = Double.parseDouble(1 + num2);
		System.out.println((int)ccc);
	}

}
