import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
        int totalChildren = 0;
        int famof2 = 0;
        int famof3 = 0;
        int famof4ormore = 0;

        int[] familyCounts = new int[T];

        for (int i = 0; i < T; i++) {
            int boycount = 0;
            int girlcount = 0;
            int totalchildren = 0;

            do {
                if (generator.nextDouble() < 0.5) {
                    boycount++;
                    totalchildren++;
                } else if (generator.nextDouble() > 0.5) {
                    girlcount++;
                    totalchildren++;
                }
            } while (boycount < 1 || girlcount < 1);

            familyCounts[i] = totalchildren;
            totalChildren += totalchildren;

            if (totalchildren == 2) {
                famof2++;
            } else if (totalchildren == 3) {
                famof3++;
            } else if (totalchildren >= 4) {
                famof4ormore++;
            }
        }

        double averageChildren = (double) totalChildren / T;

        System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + famof2);
        System.out.println("Number of families with 3 children: " + famof3);
        System.out.println("Number of families with 4 or more children: " + famof4ormore);

        int mode = calculateMode(familyCounts);
        System.out.println("The most common number of children is " + (mode >= 4 ? "4 or more" : mode) + ".");
    }

    private static int calculateMode(int[] array) {
        int maxValue = 0, maxCount = 0;

        for (int i = 0; i < array.length; ++i) {
            int count = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[j] == array[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = array[i];
            }
        }

        return maxValue;
    }
}
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	


