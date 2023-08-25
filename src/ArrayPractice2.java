
public class ArrayPractice2 {
	public static void main(String[] args) {
		
		int[] myArray = {5, 10, 15, 50, 20, 25};
		//initiating variable for max loop
		int max=0;
		
		for (int i = 0; i<myArray.length; i++) {
			  if(max<myArray[i]) {
				  max=myArray[i];
			  }
			}
		
		System.out.println(max);
	}
}
