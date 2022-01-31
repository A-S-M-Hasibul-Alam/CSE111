public class Main {
 public static void main(String[] args) {
  Foo foo1 = new Bar();
  Foo foo2 = new Mumble();
  Bar bar1 = new Bar();
  Baz baz1 = new Baz();
  Baz baz2 = new Mumble();
  Object obj1 = new Baz();
  foo1.method1();        

foo2.method1();          

bar1.method1();          

baz1.method1();          

baz2.method1();          
//obj1.method1();//c.t          

foo1.method2();          

foo2.method2();          

bar1.method2();          

baz1.method2();          

baz2.method2();          

//obj1.method2();//c.t          

bar1.method3();          

//baz2.method3();//c.t          

((Bar)foo1).method3();   

//((Mumble)baz1).method3();//r.t

((Mumble)baz2).method3();

//((Bar)foo2).method3();//r.t

((Baz)foo2).method2();   

//((Mumble)obj1).method2();//r.t

 }
}
