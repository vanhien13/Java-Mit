package Mit;

import java.util.Arrays;

/* ranking first and second */
class Marathon {
	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
				"Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
				"Daniel", "Neda", "Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
				393, 299, 343, 317, 265 };

		String x = "Hello";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}

		int min_index = smallestIndex(times);
		System.out.println(min_index);
		
		int secondmin = secondminIndex(times);
		System.out.println(secondmin);
		
		message(x);	

	}

	public static int smallestIndex(int[] array) {
		int currentValue = array[0];
		int smallestIndex = 0;
		for (int j = 1; j < array.length; j++) {
			if (array[j] < currentValue) {
				currentValue = array[j];
				smallestIndex = j;
			}
		}
		return smallestIndex;
	}


	public static void message(String x){
		System.out.println(x);
	} 
	
	public static int secondminIndex(int[] array){
	int min, secondmin;
	min = secondmin = array[0];
	for(int i = 1; i < array.length; i++) {
		if(array[i] < min) {
			secondmin = min;
			min = array[i];
			}
		}
	return secondmin;
	}
}
