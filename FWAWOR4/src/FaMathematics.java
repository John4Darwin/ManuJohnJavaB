import java.util.Scanner;

public class FaMathematics {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter 2 Numbers");
	float n1=S.nextFloat();
	float n2=S.nextFloat();
	System.out.println("1 for Addition \n2 for Subtraction \n3 for Multiplication \n4 for Division \n Enter your Choice");
	int E=S.nextInt();
	Maths(n1,n2,E);
}
static void Maths(float a,float b ,int C) {


	float R;
	switch(C) {
	case 1:
		R=a+b;
		System.out.println("Result is "+R);
		break;
	case 2:
		R=a-b;
		System.out.println("Result is "+R);
		break;
	case 3:
		R=a*b;
		System.out.println("Result is "+R);
		break;
	case 4:
		R=a/b;
		System.out.println("Result is "+R);
		break;
	default:
		System.out.println("Idiot");
	}
}
}
