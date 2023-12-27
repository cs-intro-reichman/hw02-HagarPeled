/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int i=0;
		int prevNum= (int) (Math.random()*10);
		while (i<10) {
			System.out.print(i+ " ");
			i++;
		if (prevNum < i) {
			break;
		}	
		}
		//// Write your code here
	}
}
