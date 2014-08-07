import java.util.*;
public class Counting {

	public static void main(String[] args) {
		int a=0;
		int e= 0;
		int i=0;
		int o=0;
		int u=0;
		int sum=0;
		String words;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		words = input.nextLine();
		words = words.toLowerCase();
		for(int times = 0; times < words.length(); times++)
		{
			if(words.charAt(times) == 'a'){
				sum++;
				a++;
			}
			if(words.charAt(times) == 'e'){
				sum++;
				e++;
			}
			if(words.charAt(times) == 'i'){
				sum++;
				i++;
			}
			if(words.charAt(times) == 'o'){
				sum++;
				o++;
			}
			if(words.charAt(times) == 'u'){
				sum++;
				u++;
			}
		}
		
		System.out.println("A: "+ a);
		System.out.println("E: "+ e);
		System.out.println("I: "+ i);
		System.out.println("O: "+ o);
		System.out.println("U: "+ u);
		System.out.println("Total Sum: "+ sum);
		
		
	}

}
