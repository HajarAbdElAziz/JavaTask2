import java.util.Scanner;

public class NumbersOperation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1, num2;
		System.out.println("Hi User, Please enter number one:");
		num1=in.nextDouble();
		System.out.println("Hi User, Please enter number two:");
		num2=in.nextDouble();		
		System.out.println("Num1+Num2= "+(num1+num2));
		System.out.println("Num1-Num2= "+(num1-num2));
		System.out.println("Num1*Num2= "+(num1*num2));
		System.out.println("Num1/Num2= "+(num1/num2));
		System.out.println("Num1%Num2= "+(num1%num2));
		in.close();
	}
}
