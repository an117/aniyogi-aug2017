
public class lab {
	/*
	* Write a method named sum that accepts two arrays of integers arr1 and arr2 
	* and returns an array of integers, 
	* in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 
	* You can assume arrays arr1 and arr2 have at least one element each and are the same length.
	*/
	public static int[] sum (int [] arr1, int [] arr2) {
	int [] arr3 = new int [arr1.length];
	for(int i = 0; i < arr1.length; i++) {
		arr3[i] = arr1[i] + arr2[i];
	}
	return (arr3);
	}
	/*
	* Write a method named append that accepts an array of integers arr of length n 
	* and an integer num, and returns an array of integers of length n+1 
	* that consists of the elements of arr with num appended to the end. 
	* You can assume array arr has at least one element.
	*/
	public static int[] append(int[] arr, int num){
	int [] arr2 = new int [arr.length];
	for(int i = 0; i < arr.length; i++) {
		arr2[i] = arr[i] + num;
	}
	return (arr2);
	} 
	/*
	* Write a method named remove that accepts an array of integers arr and an integer idx 
	* and returns an array of integers consisting of all of the elements of arr 
	* except for the element at index idx (thus, the returned array has a length of arr.length – 1). 
	* You can assume arr has at least two elements.
	*/
	public static int[] remove(int[] arr, int idx)
	{
	int [] array =  new int [arr.length - idx];
	for(int i = 0; i < array.length; i++) {
		array [i] = arr[i];
	}
	return array;
	}
	/*
	* Write a method sumEven that accepts an array of integers arr 
	* and returns an integer containing the sum of the elements at the even indices of arr. 
	* (That means elements at indices 0,2,4,6,8.) You can assume arr has at least one element.
	*/
	public static int sumEven(int[] arr)
	{
		int sum = 0;
	int [] array = new int [arr.length];
	for(int i = 0; i < arr.length; i++) {
		array[i] = arr[i] + i;
		if( array [i]%2 == 0 ) {
			sum =+ array[i];
		}
		
	}
	
	return sum;
	}
	
}
