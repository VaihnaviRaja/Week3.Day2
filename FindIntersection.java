package Week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		List<Integer> l1= new ArrayList<Integer>();
		List<Integer> l2= new ArrayList<Integer>();
		Collections.addAll(l1,3,2,11,4,6,7);
		Collections.addAll(l2,1,2,8,4,9,7);
		System.out.println(l1);
		System.out.println(l2);
		l1.retainAll(l2);
		System.out.println("The intersection values are: "+l1);
	}

}
