/*Produce a modifiable output by way of a single class constant
 * Class constant must
 * 		- Change width of first line
 * 		- Change width of subsequent lines
 * 		- Change number of lines following the first line
 * Use a system where the program prints line by line
 * 		- formula for number of quotation marks
 * 		- formula for number of spaces
 *      - formula for number of colons
 *      - formula for width of neck
 *      
 *Psuedocode
 *public static void base() {
 *	print first bar
 *		for (print " based on total ) {
 *			print "
 *}
 *	print second bar
 *}
 *public static void upFacing() {
 *	for (decrementing line counter) {
 *		for (print spaces based on total) {
 *			print spaces
 *		}
 *		print \
 *		for (print colons based on total) {
 *			print colons
 *		}
 *		print /
 *	}
 *}
 *public static void neck() {
 *	for (print spaces based on total) {
 *		print spaces
 *	}
 *	print ||
 *}
 *public static void downFacing() {
 *	for (decrementing line counter) {
 *		for (print spaces based on total) {
 *				print spaces
 *		}
 *		print /
 *		for (print colons based on total) {
 *			print colons
 *		}
 *		print \
 *	}
 *}
 *public static void main {
 *	base
 *	upFacing
 *	neck
 *	downFacing
 *	base
 *}	

*/

public class Hourglass {
	public static final int TOTAL = 4;  //modifiable class constant
	public static void base() {  //prints the top base of the hour glass
		System.out.print("|");
		for (int i = 1; i <= TOTAL * 2 + 2; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void upFacing() {  //prints the upward facing section of the hour glass
		for (int lines = TOTAL; lines > 0; lines-- ) {
			for (int spaces = 1; spaces <= -lines + TOTAL + 1 ; spaces++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int colons = 1; colons <= lines * 2; colons++ ) {
				System.out.print(":");
			}
			System.out.println("/");
		}
	}
	public static void  neck() {  //prints the middle section of the hourglass
		for (int spaces = 1; spaces <= TOTAL + 1; spaces++) {
			System.out.print(" ");
		}
		System.out.println("||");
	}
	public static void downFacing() { //prints the downward facing section of the hourglass
		for (int lines = TOTAL; lines > 0; lines--) {
			for (int spaces = 1; spaces <= lines; spaces++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for (int colons = 1; colons <= -2 * lines + (2 * TOTAL +2); colons++) {
				System.out.print(":"); 
			}
			System.out.println("\\");
		}
	}
	
	public static void main(String[] args) {  //prints the hourglass
		base();
		upFacing();
		neck();
		downFacing();
		base();
	}
}
				
				
				
		
	
