// Amit Niyogi
//September 5,2017
// This is our home grown library that will contain various mathematic methods
public class Calculate2 {
	/* This is takes an integer and return its square
	 * 
	 */
public static double square(double operand) {
	return operand * operand;
}
public static double cube(double operand) {
	return operand * operand * operand;
}
public static double averagetwo(double a, double b) {
return (a+b)/2;
}
public static double averagethree(double c, double d, double e) {
	return (e+d+c)/3;

}
public static double todegrees(double radian) {
	double pi = 3.14159 ;
	return (360/ (2*pi))*radian;

}
public static double toRadians(double angle) {
	double pi = 3.14159;
	return ((2*pi)/ 360) * angle;

}
public static double discremenent(double a, double b, double c) {
	return ((b*b)-(4*a*c));
}
public static double toImproperFrac(double a, double b, double c) {
	return ((a*c)+b)/(a*c);
}
public static String toMixedNum(int a,int b) {
	int wh = a % b;
	int n = a - wh * b;
	int d = b;
	String MixedNum = wh +"_" + n +"/" + d;
	return MixedNum;
}
public static String foil(int a,int b, int c, int d) {
	int aa = c * a;
	int bb = (a*d) + (b*c);
	int cc = (b*d);
	String foil = aa+"x^2"+"+" +bb+"x" +"+"+ cc;
	return foil;
}
public static boolean isdivisibleby(int a,int b) {
	if(a%b == 0) {
		return true;
	}
	else {
		return false;
	}
	
}
public static int abslutevalue(int a	) {
	
	if(a <= 0) {
		return (a+(2*a));
	}
	else {
		return a;
	}
}
public static int max(int a, int b	) {
		
		if(a <= b) {
			return b;
		}
		else {
			return a;
		}
}
public static int min(int a, int b	) {
	
	if(a <= b) {
		return a;
	}
	else {
		return b;
	}
}
public static double round(double a	) {
	double r = 0.0;
	int tempint = int ( orig* 1000);
	int roundNum = tempint %10;
	tempint = tempint / 10;
	if(roundNum >= -5 && tempint > 0) {
		
	}
	
}
public static double exponent(int x, int xpon) {
	int y = x;
	for(int i = 1; i < xpon; i++){
		x = x *y ;
        
		
}
return x;
}



public static int factorial(int n){
	int prod = 1;
	for(int i = 2; i <= n; i++){
	prod = prod* i;
}
return prod;
}	

public static int isprime(int a){
	for(int i = 4; i <= 10; i++){
         		int b = a%i;
         		String x = "no";
         		String y = " yes";
		if(b != 0){
			return a; //if the number is printed back it means no
}
		else{
			return b;//if b id prought back than it is yes
		
		}
		}
	
}

public static int gcf(int num1, int num2){
	int gcf;
	for(int i=1; i<=num1 || i<=num2; i++){
		if(num1%i==0 && num2%i==0){
                return i;
           }
       }
  
}
public static int sqrt(int a, int guess){
	int sqrt = (a/guess +guess)/2;
	return sqrt;
}


}
 

