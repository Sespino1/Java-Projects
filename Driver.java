
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		String sentence;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the sentence you want to reverse: ");
		sentence= input.nextLine();
		System.out.println("My sentence is : "+sentence);
		
		ReverseString rev= new ReverseString(sentence);
		rev.reverse(sentence);
		
		

	}

}
