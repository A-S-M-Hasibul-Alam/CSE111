public class ComplexNumber extends RealNumber{
  public double imaginarypart;
  ComplexNumber(){
    super(1.0);
    imaginarypart = 1.0;
  }
  ComplexNumber(double r, double i){
    super(r);
    imaginarypart = i;
  }
  public String toString(){
    return "RealPart: "+getRealValue()+"\n"+"Imaginary Part: "+imaginarypart;
  }
  public void check(){
    System.out.println("I'm in ComplexNumber class");
    ping();
    System.out.println("checking ended");
  }
}