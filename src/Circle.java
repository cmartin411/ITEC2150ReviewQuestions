
public class Circle {
	//creating double radius.
  private double radius;

  // creating class with field
  public Circle(double radius) {
    this.radius = radius;
  }
  
  //getRadius method to check myself
  public double getRadius() {
    return this.radius;
  }
  
  //calculateArea method
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

}
/*
Create a class `Circle`
 with a field `radius` 
 
 and a method `calculateArea()` that returns the area of the circle.
  Create an instance of the class and calculate its area.
*/