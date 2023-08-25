
public class StudentTester {
	 public static void main(String[] args) {  
		 
		//create an array of students   
		 Student[] studentArray = new Student[5] ;  
		 
		 //populate the array
		 studentArray[0] = new Student("Jeff",16);  
		 studentArray[1] = new Student("Sarah",17);  
		 studentArray[2] = new Student("Micheal",25);  
		 studentArray[3] = new Student("David",19);  
		 studentArray[4] = new Student("John",23);  
		 
	
		 
		 //display students above 20 years of age.
		 for (int i = studentArray.length-1; i >= 0; i--) {
			 if(studentArray[i].age>20) {
				 System.out.println(studentArray[i].name);
				 
			 }
			
			}
		 
		 }  
		 }  