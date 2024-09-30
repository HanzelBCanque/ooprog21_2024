public class Circle {

  
  static double radius = 1;
  static double diameter = 2 * radius;
  static double area = Math.PI * radius * radius;

    public Circle() {
    this.radius = radius;
    this.diameter = diameter;
    this.area = area;
  }

    public void setRadius(double radius) {
    this.radius = radius;
    this.diameter = 2 * radius;
    this.area = Math.PI * radius * radius;
  }

  
  public static double getRadius() {
    return radius;
  }

 
  public static double getDiameter() {
    return diameter;
  }


  public static double getArea() {
    return area;
  }
}