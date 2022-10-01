import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {
		int a, b, sum, diff, prod, quo, rem;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		sum = a + b;
		diff = a - b;
		prod = a * b;
		quo = a / b;
		rem = a % b;
		System.out.println("sum=" + sum);
		System.out.println("diff=" + diff);
		System.out.println("prod=" + prod);
		System.out.println("quo=" + quo);
		System.out.println("rem=" + rem);
	}
}