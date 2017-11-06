package ex2;
import java.util.Arrays;
public class ex3 {
	
	public static void main(String[] args) {
	int num =  7;
	String strMain = "APCS";
	int [] arrMain = {1,2,3,4,5};
	changeMe(num,strMain, arrMain);
	System.out.println(num);
	System.out.println(strMain);
	System.out.println(Arrays.toString(arrMain));
	public static void changeMe(int x, String str, int [] arr) {
		x= 8;
		str = "APCS1";
		for(int i = 0; i <arr.length; i++) {
			arr[i]++;
		}
		//a =startValue
		//b = a
		//a= newvalue
		int b =x;
		x = 10;
		System.out.println("b: " + b);
		String bStr = str;
		str = "Hello";
		System.out.println("bStr: " + str);
		int [] Barr =  arr;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = 0;
		}
		System.out.println("Barr" + Arrays.toString(Barr));
	}
	
	}

}
