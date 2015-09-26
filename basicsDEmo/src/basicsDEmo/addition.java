package basicsDEmo;
import java.util.Scanner;
import java.math.BigInteger;

/*public class addition {
public static void main(String[] args) {
	int x,y;
	Scanner input=new Scanner(System.in);
	System.out.println("enter x and y values");
	x=input.nextInt();
	y=input.nextInt();
	int z=x+y;
	System.out.println("the result is "+z);
}
}*/
public class addition{
	public static void main(String[] args) {
		String  number1,number2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		number1=s.nextLine();
		number2=s.nextLine();
		BigInteger first=new BigInteger(number1);
		BigInteger second=new BigInteger(number2);
		BigInteger sum ;
		sum=first.add(second);
		System.out.println("the result is"+sum);
	}
}
