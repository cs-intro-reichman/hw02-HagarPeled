
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	    int boycount= 0;
	    int girlcount=0;
	    int totalchildren=0;
		
        do {
            if (Math.random() < 0.5) {
                System.out.print("b ");
                boycount++;
                totalchildren++;
            }

             else if (Math.random() > 0.5) {
                System.out.print("g ");
                girlcount++;
                totalchildren++;
            }
            
		} while (boycount < 1 || girlcount < 1);
		
	System.out.println("\nYou made it... and you now have  "+ totalchildren + " children.");	
	}
}
