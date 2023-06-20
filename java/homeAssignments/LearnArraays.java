package homeAssignments;

import java.util.Arrays;

public class LearnArraays {

	public static void main(String[] args) {
		int scores[]= {23,84,54,66,78};

		int length = scores.length;
		
		System.out.println(length);
		System.out.println(scores[3]);
		
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			
			
			
		}
	}

}
