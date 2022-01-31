public class Sphere extends Point{
  Sphere(double r){
    super(r);
  }
  public double space(){
    double area  = 4/3*Math.PI*getRadius()*getRadius()*getRadius();
    return area;
  }
  public String toString(){
    return "Enter radius of a Sphere: "+getRadius()+"\n"+"Creating a Sphere … done!"+"\n"+"The area of the Sphere is "+space();
  }
}