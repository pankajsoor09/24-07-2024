package pack1;

public class Array {

	public static void main(String[] args) {

		// Declare a 2D array of exam scores of students 
		int[][] scores = { 
				{ 90, 80, 70 }, //student 1  (90+80+70)=80.0
				{ 60, 50, 40 }, // student 2 
				{ 30, 20, 10 }  // student 3
				};

		// Calculate the average score for each student
		for (int i = 0; i < scores.length; i++) { // for loop is mentioned below in comment to understand
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];//sum = sum + scores[i][j];
			}
			double average = sum / scores[i].length;
			System.out.println("Student " + (i + 1) + " average score: " + average);
		}

	}

}
/* output
 * Student 1 average score: 80.0
 * Student 2 average score: 50.0
 * Student 3 average score: 20.0
 */

/*For loop 
First Iteration of the Outer Loop (i = 0):
    sum is initialized to 0.
    First Iteration of the Inner Loop (j = 0):
        scores[0][0] is 90.
        sum += scores[0][0]; translates to sum = sum + 90;:
        Current sum is 0.
        Add 90 to sum, so sum becomes 90.
    Second Iteration of the Inner Loop (j = 1):
        scores[0][1] is 80.
        sum += scores[0][1]; translates to sum = sum + 80;:
        Current sum is 90.
        Add 80 to sum, so sum becomes 170.
    Third Iteration of the Inner Loop (j = 2):
        scores[0][2] is 70.
        sum += scores[0][2]; translates to sum = sum + 70;:
        Current sum is 170.
        Add 70 to sum, so sum becomes 240.
*/


