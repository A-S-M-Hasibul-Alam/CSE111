public class MyString {
 String s ;
   static char [] a ;
   MyString (String s) {
     this.s = s ;
     a = s.toCharArray () ;
   }
   
   //TASK1
   int length () {
     return a.length ;
   }
   
   //TASK2
   public void charAt (int n) {
     if (n >= 0 && n < a.length) {
       System.out.println (a [n]) ;
     }
     else {
       System.out.println ("Invalid") ;
     }
   }
   
   //TASK3
   public void startsWith (String sec) {
     char [] a2 ;
     boolean s = false ;
     a2 = sec.toCharArray () ;
     if (a.length < a2.length) {
       System.out.println ("False") ;
     }
     else {
       int i = 0 ;
       while (i < a2.length) {
         if (a[i] == a2 [i]) {
           i ++ ;
           s = true ;
         }
         else {
           s = false ;
         }
       }
       System.out.println (s) ;
     }
   }
   
   //TASK4
   void endsWith (String sec) {
     char [] a2 ;
     boolean s = false ;
     a2 = sec.toCharArray () ;
     if (a.length < a2.length) {
       System.out.println (s) ;
     }
     else {
       int i = a2.length - 1 ;
       int j = a.length - 1 ;
       while (i >= 0) {
         if (a[j] == a2 [i]) {
           i -- ;
           j -- ;
           s = true ;
         }
         else {
           s = false ;
         }
       }
       System.out.println (s) ;
     }
   }
   //TASK5
   void replaceFirst (char oldChar,char newChar) {
     char a2 [] = new char [a.length] ;
     for (int i = 0 ; i < a.length ; i ++) {
       a2 [i] = a [i] ;
     }
     for (int i = 0 ; i < a2.length ; i ++) {
       if (a2 [i] == oldChar) {
         a2 [i] = newChar ;
         break ;
       }
     }
     for (int i = 0 ; i < a2.length ; i ++) {
       System.out.print (a2 [i]) ;
     }
   }
   
   //TASK6
   void replaceAll (char oldChar,char newChar) {
     char a2 [] = new char [a.length] ;
     for (int i = 0 ; i < a.length ; i ++) {
       a2 [i] = a [i] ;
     }
     for (int i = 0 ; i < a2.length ; i ++) {
       if (a2 [i] == oldChar) {
         a2 [i] = newChar ;
       }
     }
     for (int i = 0 ; i < a2.length ; i ++) {
       System.out.print (a2 [i]) ;
     }
   }
   
   //TASK7
   void replaceLast (char oldChar,char newChar) {
      char a2 [] = new char [a.length] ;
      for (int i = 0 ; i < a.length ; i ++) {
        a2 [i] = a [i] ;
      }
      for (int i = a2.length - 1 ; i >= 0 ; i --) {
        if (a2 [i] == oldChar) {
          a2 [i] = newChar ;
          break ;
        }
      }
      for (int i = 0 ; i < a2.length ; i ++) {
        System.out.print (a2 [i]) ;
      }
    }
   
   //TASK8
   void toLowerCase () {
    String temp_s = s.toLowerCase () ;
    System.out.println (temp_s) ;
   }
   
   //TASK9
   void toUpperCase () {
    String temp_s = s.toUpperCase () ;
    System.out.println (temp_s) ;
   }
  
   public static void main (String [] args)  {
     MyString t1 = new MyString ("WINTERFELL") ;
     
     //TASK1
     System.out.println (t1.length ()) ;
     
     //TASK2
     t1.charAt (3) ;
     
     //TASK3
     t1.startsWith ("WINTER") ;
     
     //TASK4
     t1.endsWith ("FELL") ;
     
     //TASK5 
     t1.replaceFirst ('L' , 'e') ;
     System.out.println () ;
     
     //TASK6
     t1.replaceAll ('L' , 'e')  ;
     System.out.println () ;
     
     //TASK7
     t1.replaceLast ('L' , 'e') ;
     System.out.println () ;
     
     //TASK8
     t1.toLowerCase () ;
     
     //TASK9
     t1.toUpperCase () ;
   }
}
