
public class Week3 {
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;		
	}
	
	public static String Names(String first, String last) {
		String fullName = first + " " + last;
		return fullName;						
	}
	
	//write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.	
	public static boolean  greaterThan100(int[] numbers ) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = numbers[i] + sum; 
		}
		return sum  > 100;
	}
    //Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double findAverage(double[] elements) {
		double sum = 0;
		for (int i = 0; i < elements.length; i++) {
			sum = elements[i] + sum;
		}
		double average = sum / elements.length;
		return average;
	}
	//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean firstGreaterThanSecond(double[] first, double[] second ) {
		double firstAverage = findAverage(first);
		double secondAverage = findAverage(second);
		return firstAverage > secondAverage; 
	}
	//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(double moneyInPocket, boolean isHotOutside) {
	    double  m = 10.50;
	    if (isHotOutside && moneyInPocket > m ) {
	    	return true;
	    } else {
	    	return false;
	   }
	    
	}
	//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	//Created a method isRentDue with parameters dayOfMonth and paidAlready
	// if dayOfMonth is less 15 true
	// if dayOfMonth is grater 15 false 
	public static boolean isRentDue(int dayOfMonth, boolean paidAlready) {
		if (paidAlready ) {
			return false;
		}
		 if (dayOfMonth < 15) {
			return true;
		} else { 
			return false;
		}
		
							
	}
	public static void main(String[] args) {
		System.out.println(multiplyString("Hello",5));
		System.out.println(Names("Billy", "Bob"));
		int [] myNum = {10,20,30,40,50};
		System.out.println(greaterThan100(myNum));
		double [] myDoub = {0.00, 0.00, 13.99};
		double [] twoDoub = {11.99, 8.99, 2.99};
		System.out.println(findAverage(myDoub));
		System.out.println(firstGreaterThanSecond(myDoub,twoDoub));
		System.out.println(willBuyDrink(12, true));
		System.out.println(isRentDue(28, false));
		
		
		
		

	}

}
