
public class Problems {
	public static void main(String[] args) {  
	}
	// Problem #1
	/*
	public static int sumDigits(int n) {
		int sum=0,remainder=0;
		do {
			sum=sum+(n%10);
			  n=n/10;
			}
			while (remainder>0);
			return sum;

}
		 
}
*/

	//Problem #2
	/*
public long factorial(int number) {
	long factorial=1;
	
		for(int i=number;i>0;i--) {
		factorial=factorial*i;
	}
		return factorial;
	}
	
	*/
	
	//Problem #3
	/*
	public boolean isLeapYear(int year) {
		if(year%4==0) {
			return true;
		}
		else {
			return false;
		}
	}
	*/
	
	// Problem #4
	/*
	public int countOccurrences(String text, char target) {
		  int count=0;
		  
		  for(int i=0; i<text.length(); i++){
		    if(text.charAt(i)==target){
		      count++;
		    }
		    
		  }
		  return count;
		}
*/
	
	// Problem #5
	/*
	public int countVowels(String s) {
	int count=0;
	for(int i=0;i<=s.length()-1; i++) {
		 
	    if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
	      count++;
	    }
	  }
	  return count;
	}
	*/
	
	//Problem #6
	/*
	public int[] reverseArray(int[] nums) {
			int[] newArray = new int[nums.length];

		       for (int i = 0; i < nums.length; i++) {
		           newArray[nums.length - 1 - i] = nums[i];
		       }

		       return newArray;
		   }
	}
	*/
	
	
	
	
	
	
	
	
	
}