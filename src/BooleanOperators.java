import java.util.Scanner;

public class BooleanOperators {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1, num2;
		System.out.println("Hi User, Please enter number one:");
		num1=in.nextDouble();
		System.out.println("Hi User, Please enter number two:");
		num2=in.nextDouble();		
		boolean x = num1 > num2;
		System.out.println("Num1>Num2? "+x);
		x = num1 >= num2;
		System.out.println("Num1>=Num2? "+x);
		x = num1 < num2;
		System.out.println("Num1<Num2? "+x);
		x = num1 <= num2;
		System.out.println("Num1<=Num2? "+x);
		x = num1 == num2;
		System.out.println("Num1==Num2? "+x);
		x = num1 != num2;
		System.out.println("Num1!=Num2? "+x);
		in.close();
	}

}
