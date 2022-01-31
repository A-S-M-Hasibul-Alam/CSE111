public class AndroidPhone extends Phone{
  public String msg = "I am an android cell phone";
  
  public void shout(){
    super.shout();
    System.out.println(msg);
  }
}

