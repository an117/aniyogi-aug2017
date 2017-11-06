import java.util.Scanner;     
public class QuadraticClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		// two scanners created
		
		System.out.println("Would you like to use qudriatic decriber?");
		String x = scanner.nextLine();
		while(x.equals("yes")) {//while x = yes the whole process will continue
			//ask for coefficients
		System.out.println("input your \"a\" coefficient");
		
		int a = scan.nextInt();
		//asks for input and gets one
		System.out.println("input your \"b\" coefficient");
		int b = scan.nextInt();
		//asks for input and gets one

		System.out.println("input your \"c\" coefficient");
		int c = scan.nextInt();
		//asks for input and gets one

		
		System.out.println(Client.quadrDescriber(a,b,c) );
		//the overall string  that was returned is printed
		System.out.println("Would you like to use again?");
		x = scanner.nextLine();
		//asks for yes or no -if no its stops automatically, and yes it continues
		}
	}

}
