// Amit Niyogi
//September 5,2017
// This is our home grown library that will contain various mathematic methods
public class Calculate2 {
	/* This is takes an integer and return its square
	 * 
	 */
	public static int square(int operand) {
		return operand * operand;
	}
	//cube the input
	public static int cube(int operand) {
		return operand * operand * operand;
	}
	//average 2 inputs
	public static double average(double num1, double num2) {
		return (num1+num2)/2;
	}
	//average 3 inputs
	public static double average(double num1, double num2, double num3) {
		return (num1+num2+num3)/3;

	}
	//radians into degrees
	public static double toDegrees(double radian) {
		double pi = 3.14159 ;
		return (360/ (2*pi))*radian;
	}
	//degrees into radians
	public static double toRadians(double angle) {
		double pi = 3.14159;
		return ((2*pi)/ 360) * angle;
	}
	//this method uses 3 coefficients and returns the value of the discriminant
	public static double discriminant(double a, double b, double c) {
		return ((b*b)-(4*a*c));
	}
	//this method accepts a three integer and returns a string or the improper fraction
	public static String toImproperFrac(int aa, int ab, int ac) {
		int numerator = aa*ab+ac;
		int denominator = ab;
		String improper = numerator + "/" + denominator;
		return improper;
	}

	//this method accepts two integers and returns a string or the Mixed number fraction
	public static String toMixedNum(int ac,int bc) {
		int whole = ac % bc;
		int n = ac - whole * bc;
		int d = bc;
		String MixedNum = whole +"_" + n +"/" + d;
		return MixedNum;
	}
	//this method converts a binomial multiplication into a quadratic equation
	public static String foil(int ad,int bd, int cd, int dd) {
		int aa = cd * ad;
		int bb = (ad*dd) + (bd*cd);
		int cc = (bd*dd);
		String foil = aa+"x^2"+"+" +bb+"x" +"+"+ cc;
		return foil;
	}
	//this method accepts two integers and returns boolean
	public static boolean isdivisibleby(int num1,int num2) {
		if(num1%num2 == 0) {
			return true;
		}
		else {
			return false;
		}
	
	}
	//this method accepts a double and returns a double
	public static double abslutevalue(double num) {
	
	if(num <= 0) {
		return (num+(2*num));
		}
	else {
		return num;
		}
	}
	//this method accepts two doubles and returns a double
	public static double max(double am, double bm) {
	if(am <= bm) {
		return bm;
		}
	else {
		return am;
		}
	}
	//this method accepts three doubles and returns a double
	public static double max(double ma, double mb, double mc) {
	
	if (ma > mb  & ma > mc) {
		return ma;
	} else if (mb > ma & mb > mc) {
		return mb;
	} else {
		return mb;
	}

	}
	//this method accepts two integers and returns an int
	public static int min(int a, int b) {
	
	if(a <= b) {
		return a;
		}
	else {
		return b;
		}
	}
	//this method returns a double
	public static double round2(double orig	) {
		double result = 0.0;
	
		int tempInt = (int)(orig * 1000);
		int roundNum = tempInt % 10;
		tempInt = tempInt / 10;
		if (roundNum >= 5 && tempInt > 0)
			tempInt++;
		else if(roundNum <= -5 && tempInt < 0)
			tempInt--;
		result = tempInt / 100.0;
		return result;

	}
	//this method accepts a double and an integer to return a double
	public static double exponent(double x, int xpon) {
		double y = x;
		for(int i = 1; i < xpon; i++){
			x = x * y;
		}
		return x;
	}
	//this method accepts an integer and returns an integer
	public static int factorial(int n){
		int prod = 1;
		if (n == 0) {
			return 1;
		}else {
			for(int i = 2; i <= n; i++){
				prod = prod* i;
		}
			return prod;
		}
	}
	// this takes in an integer and returns back a boolean
	public static boolean isprime(int num)  { 
	
	for(int i = 4; i <= 10; i++){
        return isdivisibleby(num,i); 			
		}
	return false;
	}

	// the method inputs two integers and returns an integer
	public static int gcf(int num1, int num2){
		if(isprime(num1) == false) {
			if(max(num1,num2)%min(num1, num2) != 0) {
				return 1;
			}else {
				return min(num1, num2);
			}
		
		}
		
		for(int gcf=1; gcf<=num1 || gcf<=num2; gcf++){
			if(num1%gcf==0 && num2%gcf==0){
                return gcf;
			}
		}
		return 0;
	}
	//this method inputs a double and returns a double, or at least the squareroot of the input
	public static double sqrt(double number) {
		double t;
		double squareRoot = number / 2;
 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);

		return round2(squareRoot);
	}

	//	this method uses the methods discriminant, round 2, and sqrt by intaking three integers and returning a double
 
	public static String quadForm(int a , int b, int c) {

		if(a == 0) {
			throw new IllegalArgumentException("variable \"a\" must be greater than 0.");
		}
		if(discriminant(a,b,c)<0) {
			return "no real roots";
		}
		double add = round2(((-b) + sqrt(discriminant(a,b,c)))/(2*a));
		double subtract = round2(((-b) - sqrt(discriminant(a,b,c)))/(2*a));
		String add2 = Double.toString(add);
		String subtract2 = Double.toString(subtract);
		String as = add2 + " " + subtract2;
		if(discriminant(a,b,c) == 0) {
		
			return add2;
		}
		else {
			return as;
		
		}
	
	}
}
 

