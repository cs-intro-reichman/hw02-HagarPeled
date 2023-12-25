/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String word=(args[0]);
		String reversed= "";
		int length = word.length();

for (int n = length - 1; n >= 0; n--) {
	reversed += word.charAt(n);
}

System.out.println(reversed);
System.out.println("The middle character is "+ word.charAt((length/2)-1));

	}
}
