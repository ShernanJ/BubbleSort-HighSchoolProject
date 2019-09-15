/*
	Name: BubbleSort.Java
	Author: Shernan Javier
	Date: Mar. 4, 2019
	Version: 1.0
	Description: A simple program that sorts the elements in the array using the Bubble sort algorithm.
 */

public class BubbleSort {

	public static void main(String[] args) 
	{
		int array [] = {2, 6, 4, 8 , 10, 12, 89, 68, 45, 37};
		
		//Output of original array
		System.out.println("\nData items in original order");
		for (int counter = 0 ; counter < array.length ; counter++)
		{
			System.out.println("Array" + counter + " is " + array[counter]);
		}
		
		bubbleSort(array); //call to the sort array
		
		//output of sorted array
		System.out.println("\nData items in ascending order ");
		for (int counter = 0 ; counter < array.length ; counter++)
		{
			System.out.println("Array " + counter + " is " + array[counter]);
		}
	}//Main method
	
	//Sort elements of array with a bubble sort
	public static void bubbleSort(int array2[])
	{
		//loop to control number of passes
		for(int pass = 1 ; pass < array2.length ; pass++)
		{
			//loop to control number of comparisons for length of array - 1
			for (int element = 0 ; element < array2.length - 1 ; element++)
			{
				//Compare side-by-side elements and swap them if
				//First element is greater than second element swap them
				if(array2 [element] > array2 [element + 1])
				{
					swap(array2, element, element + 1); //call to swap method
				}
			}//end loop to control comparisons
		}//end loop to control passes
	}//BubbleSort method
	
	//method to swap two elements of an array
	public static void swap (int array3 [], int first, int second)
	{
		int hold; //temporary holding area for swap
		
		hold = array3[first];
		array3 [first] = array3 [second];
		array3 [second] = hold;
	} //swap method
}//Bubble Sort class
