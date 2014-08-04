import java.util.*;
public class PigLatin {

	public static void main(String[] args) {
		String word;
		String firstLetter;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word: ");
		word = input.nextLine();
		
		firstLetter = word.substring(0,0);
		firstLetter+="-ay";
		
		word = word.substring(1);
		word += firstLetter;
		
		System.out.println(word);
	}

}
