/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N= Integer.parseInt(args[0]);
		int SumDiv=0;
		StringBuilder divisorString = new StringBuilder();
		
		for (int divisor= 1; divisor <=N / 2; divisor++)
	      if (N%divisor==0){
	         if (divisor != N) {
	 	        if (divisorString.length() > 0) {
                    divisorString.append(" + ");
                    
	 	    }
	  }
	  SumDiv += divisor;
	  divisorString.append(divisor);
	  }
	  
	  
	  if (SumDiv==N) {
	      System.out.println(N +" is a perfect number since " + N +" = " + divisorString);
	  }
	   else {
	      System.out.println(N + " is not a perfect number");
	}
}
}
