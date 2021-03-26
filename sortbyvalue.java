package sortalgorithms;
import java.util.*;
import java.lang.*;

public class sortbyvalue {

	// function to sort hashmap by values
	public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
	{
		// Create a list from elements of HashMap
		List<Map.Entry<Integer, Integer> > list =
			new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
			public int compare(Map.Entry<Integer, Integer> o1,
							Map.Entry<Integer, Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		// put data from sorted list to hashmap
		HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

	// Driver Code
	public static void main(String[] args)
	{

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 int[] arr = new int[]{ 1,2,3,4,5};
		 hm.put(arr[0], 2);
		 hm.put(arr[1], 1);
		 hm.put(arr[2], 0);
		 hm.put(arr[3], 1);
		 hm.put(arr[4], 2);
		
		Map<Integer, Integer> hm1 = sortByValue(hm);

		// print the sorted hashmap
		for (Map.Entry<Integer, Integer> en : hm1.entrySet()) {
			System.out.println(+ en.getKey() );
		}
	}
}
