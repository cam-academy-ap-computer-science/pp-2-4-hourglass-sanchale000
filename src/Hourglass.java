/*Produce a modifiable output by way of a single class constant
 * Class constant must
 * 		- Change width of first line
 * 		- Change width of subsequent lines
 * 		- Change number of lines following the first line
 * Nested for loops must
 * 		- 
 * 

*/

public class Hourglass {
	public static final int LINES = 4;  //modifiable class constant
	public static void bases() {  //prints the top of the hour glass
		System.out.print("|");
		int countOne = LINES * 2 + 2;
			for (int i = 1; i <= countOne; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void upFacing() {
		for (int spaces = 1; spaces <= LINES; spaces++) {
			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");				
			}
			System.out.print("\\");
			for
		}
	}
	
	public static void main(String[] args) {
		bases();
		upFacing();
	}
}
				
				
				
		
	
