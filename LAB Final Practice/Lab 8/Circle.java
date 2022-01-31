public class Circle extends Point{
  Circle(double r){
    super(r);
  }
  public double space(){
    double area  = Math.PI*getRadius()*getRadius();
    return area;
  }
  public String toString(){
    return "Enter radius of a circle: "+getRadius()+"\n"+"Creating a Circle … done!"+"\n"+"The area of the Circle is "+space();
  }
}