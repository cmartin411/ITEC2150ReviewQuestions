
public class ArrayPractice1 {
	public static void main(String[] args) {
		
		
	int[] myArray = {5, 10, 15, 20, 25};
	//initiating sum for addition loop
	int sum=0;
	
	for (int i = 0; i<myArray.length; i++) {
		  sum+=myArray[i];
		}
	
	System.out.println(sum);
	

}
}