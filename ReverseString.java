import java.util.*;
public class ReverseString {
	String sentence;
	int size;

	ReverseString(String line)  //constructor
	{
	
		sentence = line;
		size = sentence.length();
	}
	
	public void reverse(String lines){
		for(int times = size-1; times >= 0; times--)
		{
			System.out.print(sentence.charAt(times));
		}
	}
}
