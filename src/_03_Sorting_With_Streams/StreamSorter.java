package _03_Sorting_With_Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class StreamSorter {
	public static void main(String[] args) {
		Random rGen = new Random();
		Integer[] nums = new Integer[50];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = rGen.nextInt();
		}
		
		//1. Convert the Integer array to Stream object.
		Stream<Integer> strm = Arrays.stream(nums);
		//2. Use the sorted method of the stream to sort the numbers.
		strm.sorted();
		//3. Use the forEach method with a lambda to print all the elements of the sorted Stream.
		//   They should be in ascending order.
		strm.forEach((item) -> System.out.println(item));
	}
}
