public class TestPhone{
  public static void printShout(Phone p){
    System.out.println("------------------");
    p.shout();
  }
  public static void main(String [] args){
    Phone p= new Phone();
    AndroidPhone a= new AndroidPhone ();
    SamsungAndroidPhone s= new
      SamsungAndroidPhone();
    System.out.println(p.msg);
    System.out.println(a.msg);
    System.out.println(s.msg);
    printShout(p);
    printShout(a);
    printShout(s);
  }
}