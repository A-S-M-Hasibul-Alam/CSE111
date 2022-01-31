public class Vehicle{
  private int x = 0;
  private int y = 0;
  public void moveUp(){
    y++;
  }
  public void moveLeft(){
    x--;
  }
  public void moveDown(){
    y--;
  }
  public void moveRight(){
    x++;
  }
  public String toString(){
    return "("+x+" ,"+y+")";
  }
}