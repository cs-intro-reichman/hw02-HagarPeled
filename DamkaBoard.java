/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int i = 0;
        int j;

        while (i < n) {
            j = 0;
            if (i % 2 == 0) {
                    System.out.print(" ");
            }
            while (j < n) {
            
                System.out.print(" *");
                j++;
            }
            System.out.println(); 
            i++;
        }
    }
}