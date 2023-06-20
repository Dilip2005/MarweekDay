package learnstring;

public class ResverEvenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

	*/                //0 1 2    3      4
		String test = "I am a software tester";
		//Iamasoftwaretester
		String[] split = test.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			System.out.print(split[i]);
			if(i%2!=1)//am,software
			{
				char[] ch = split[i].toCharArray();
			
			//am,software
			for (int j =ch.length-1; j>=0 ; j--) {
				System.out.print(ch[j]);
			}
			}else {
				System.out.print(" "+split[i]+" ");
			}
			
		}
		
		
	}

}
