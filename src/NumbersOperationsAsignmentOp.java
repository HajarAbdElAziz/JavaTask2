import java.util.Scanner;

public class NumbersOperationsAsignmentOp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1, num2;
		System.out.println("Hi User, Please enter number one:");
		num1 = in.nextDouble();
		double num3 = num1;
		System.out.println("Hi User, Please enter number two:");
		num2 = in.nextDouble();
		num3 += num2;
		System.out.println("Num1+Num2= " + num3);
		num3 = num1;
		num3 -= num2;
		System.out.println("Num1-Num2= " + num3);
		num3 = num1;
		num3 *= num2;
		System.out.println("Num1*Num2= " + num3);
		num3 = num1;
		num3 /= num2;
		System.out.println("Num1/Num2= " + num3);
		num3 = num1;
		num3 %= num2;
		System.out.println("Num1%Num2= " + num3);
		in.close();

	}

}
