class Baz extends Foo {
  public void method1() {
    System.out.println("baz method 1");
  }
  
  public void method2() {     
   System.out.println("baz method 2");
   method1();
  }
}
