package Week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list,3,2,11,4,6,7);
		System.out.println("The elements are:"+list);
		Collections.sort(list);
		System.out.println("The elements after sorting:"+list);
		System.out.println("The Second largest number is:"+list.get(4));

	}

}
