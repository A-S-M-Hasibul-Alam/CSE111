class student extends person{
String id;
course c=new course();
student(String fname,String mname,String lname,String id, int age,String cid,String cname,double cr)

{super(fname,mname,lname);
setAge(age);
c.init(cid,cname,cr);
this.id=id;

}
}