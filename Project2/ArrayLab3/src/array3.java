import java.util.Arrays;
public class array3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 =  {5, 10, 15, 20, 25, 30, 35, 40};
		int appendNum = 200;
		 int removeIdx = 5;
		int [] arr2 =  {1,2,3,4,5};
		
		System.out.println(Arrays.toString(lab.sum(arr1, arr2)) );
		System.out.println(Arrays.toString(lab.append(arr1, appendNum)) );
		System.out.println(Arrays.toString(lab.remove(arr2, removeIdx)) );
		System.out.println((lab.sumEven(arr1)) );
		
		/*
		* Write a method rotateRight that accepts an array of integers arr 
		* and does not return a value. 
		* The rotateRight method moves each element of arr one index to the right 
		* (element 0 goes to element 1, element 1 goes to element 2, …, element n-1 goes to element 0). 
		* You can assume arr has at least one element.
		*/
		

	}
	/*
	* Write a method rotateRight that accepts an array of integers arr 
	* and does not return a value. 
	* The rotateRight method moves each element of arr one index to the right 
	* (element 0 goes to element 1, element 1 goes to element 2, …, element n-1 goes to element 0). 
	* You can assume arr has at least one element.
	*/
	public static void rotateRight(int[] arr)
	{
	int [] array = new int [arr.length];
	for(int i = 0; i < arr.length; i++) {
		array[i] = arr[i-1];
	}
	System.out.print(Arrays.toString(array));
	}
}
