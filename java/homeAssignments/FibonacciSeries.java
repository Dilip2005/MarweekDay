package homeAssignments;

import java.util.HashMap;

public class FibonacciSeries {

	public static void main(String[] args) {
		
String str;
		
		str=" my name is buvi, my native is Dindigul";

		String[] splitFn = str.split(" ");

		HashMap<String,Integer> Hmap = new HashMap<String,Integer>();

		for (int i=0; i < splitFn.length-1; i++)
		{
			if (Hmap.containsKey(splitFn[i])) 
			{
				int count = Hmap.get(splitFn[i]);
				Hmap.put(splitFn[i], count+1);
			}
			else 
			{
				Hmap.put(splitFn[i], 1);
			}
		}
		System.out.println(Hmap);


	}

}
