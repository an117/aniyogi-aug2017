
public class Client {
	//the method accepts a double and returns the doubles squareroot
	public static double sqrt(double number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	//the method returns the discriminant value of the three inserted values
	public static double discriminant(double a, double b, double c) {
		return ((b*b)-(4*a*c));
	}

//method concatinates a string that contains all the information for the porabola whose a, b, and c double values are accepted
	public static String quadrDescriber(double a, double b, double c) {
		//finds the discriminant of the a, b and c value
		double vbv = discriminant(a, b, c);
		//finds the x-value of the cordinate for the vertex
		double xv = (-b)/(2*a);
		//finds the y-value of the cordinate for the vertex
		double yv = (a*(xv)) + (b*(xv)) + c;
		// String is initialized and the equation is displayed or set into memory
		String returnvalue = "equation:"+a+"x^2"+"+"+b+"x"+"+"+c+"\n";
		//determines if its really a porabola
		if(a == 0) {
			returnvalue = returnvalue + "its a line\n";
		}
		//determines if the graph's concavity
		if(a > 0) {
			returnvalue =  returnvalue +"it is a positive graph that opens up\n";
		}
		if(a < 0) {
			returnvalue =  returnvalue +"it is a negative graph that opens down\n";
		}
		//determines the axis of symmetry
		returnvalue = returnvalue + "the line of reflectional symetry is: x = " + xv +"\n";
		//finds the vertex 
		if( ((b*b) >= (4*a*c)) ) {
			double sqrt = sqrt(vbv);
			double ra = ((-b)+sqrt)/(2*a);
			double ra2 = ((-b)-sqrt)/(2*a);
			returnvalue  =  returnvalue + "the x-int is: " + "(" + ra +"," + "0)" + "and "+"(" + ra2 +"," + "0)";
			
		}
		//determines the x interecepts
		if( ((b*b) >= (4*a*c)) ){
			returnvalue =  returnvalue + "there are no x-ints";
		}
		//determines the y inetercepts
		returnvalue = returnvalue + "the graphs y-int is:" + c +"\n" + "the vertex is :" + "("+ xv + "," + yv + ")";
		
		//returns all the string 
		return returnvalue;
		

	}
}
