package pack1;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		// arr1[3] = 40;// array indexout of bound exception

		System.out.println("1st Array Elements : ");
		for (int i = 0; i < arr1.length; i++) {// arr1.length will give no of elements in 1D array
			System.out.println(arr1[i]);
		}

		System.out.println("-------------------------------");

		float[] arr2 = { 10.5f, 20.8f, 56.8f, 98.5f, 34.7f };
		System.out.println("2nd Array Elements : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println("---------------------------------");

		char arr3[] = { 'P', 'A', 'N', 'K', 'A', 'J' };
		System.out.println("Character array : ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
		}

		System.out.println("\n---------------------------------");

		int[] arr4[] = new int[2][3];// 2D array needs 2 for loop ,in 2d array length will give number of rows
		arr4[0][0] = 10;
		arr4[0][1] = 20;
		arr4[0][2] = 30;
		arr4[1][0] = 40;
		arr4[1][1] = 50;
		arr4[1][2] = 60;

		System.out.println("\n1st 2D Array : ");

		for (int i = 0; i < arr4.length; i++) {// arr4.length will give no of rows in 2D array

			for (int j = 0; j < arr4[0].length; j++) {// arr4[0] will give no of element in 0th
				System.out.print(arr4[i][j] + "\t");// \t is tab or space ...\n new line
			}

			System.out.println(); // for getting new row
		} // for loop end here.1st for loop for 1row

		System.out.println("---------------------------------");

		char[] arr5[] = { { 'H', 'i' }, { 'H', 'e', 'l', 'l', 'o' }, { 'B', 'y', 'e' } };

		System.out.println("\n2nd 2D Array : ");

		for (int i = 0; i < arr5.length; i++) {// arr5.length will give no of rows in 2D array

			for (int j = 0; j < arr5[i].length; j++) { // arr5[i].length here i is used because it has different number
														// of elements in row,it will give no of element of row
				System.out.print(arr5[i][j]);
			}

			System.out.println();
		}

		System.out.println("----------Jagged Array----------");

		long[][] arr6 = new long[4][]; // jagged array ... at least need to provide number of row
		arr6[0] = new long[] { 10, 20, 30 };
		arr6[1] = new long[] { 10, 20, 30, 40, 50 };
		arr6[2] = new long[] { 10, 20 };
		arr6[3] = new long[] { 10, 20, 30, 40 };

		for (int i = 0; i < arr6.length; i++) {// arr5.length will give no of rows in 2D array

			for (int j = 0; j < arr6[i].length; j++) { // arr6[i].length here i is used because it has different number
														// of elements in row,it will give no of element of row
				System.out.print(arr6[i][j] + "\t");// \t is used for getting space
			}

			System.out.println();
		}

	}

}

/*
 * Array : obj is created in heap stored. but point at stack reference 
 * int arr[] = new int [5]; 4*5 memory is allocated for array
 *  arr[0] = 10; at run time value is stored,run time error 
 *  arr[1] = 20; 
 *  arr[2] = 30;
 *   arr[3] = 40; 
 *   arr[5]= 50; 
 *   arr[6] = 60;// array index out of bound exception
 * 
 * int arr1[] ={10,20,30,40} array is type length is a attribute to get size
 */