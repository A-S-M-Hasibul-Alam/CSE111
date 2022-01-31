class Test {
    int x = 3;
    void m1(int[] a) {
        a[0] = x;
        a[2] = m2(a[2]);
        System.out.println(a[0]);
        System.out.println(a[2]);
        a = m2(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        Test2[] t2 = new Test2[2];
        t2[1] = new Test2(2);
    }
    int m2(int a) {
        ++a;
        System.out.println(a);
        return a+10;
    }
    int[] m2(int[] b){
        b[1] = 10;
        int[] c = {100,200,300,400};
        return c;
    }
}
