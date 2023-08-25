
public class CircleTester {
	  public static void main(String[] args) {
		  //arbitrary radius to test object.
		    int testRadius = 5;
		    
		    // creating myCircle object
		    Circle myCircle = new Circle(testRadius);
		    
		    //testing that radius is correct in the object
		    System.out.println("Radius of the circle is " + myCircle.getRadius());
		    
		    //calling calculateArea method
		    System.out.println("The area of the circle is " + myCircle.calculateArea());
		   
		  }
		}