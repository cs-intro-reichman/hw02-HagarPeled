/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
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
                if (Math.random() < 0.5) {
                    boycount++;
                    totalchildren++;
                } else if (Math.random() > 0.5) {
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
