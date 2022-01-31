public class Person {
    public int x;
    public int y;
    public void methodOne(){
        this.x += 4;
        ++y;
        System.out.println(x);
        methodTwo();
        System.out.println(y);
    }
    public void methodTwo(){
        x += y;
        this.y = x - 6;
        System.out.println(x);
        System.out.println(y);
    }
}
