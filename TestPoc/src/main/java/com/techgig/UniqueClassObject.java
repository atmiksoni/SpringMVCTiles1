package com.techgig;

/**
 * Created by skumaran on 9/15/14.
 */


class UniqueClassObject {

    public static void main(String[] args) {
        Class<C2> c2o = C2.class;
        C22 o2 = new C22();

        Class c2o2 = o2.getClass();

        C11 o11 = new C11();
        C11 o12 = o2;

        if (c2o == c2o2)
            System.out.println("c2o and c2o2 objects are same.");

        if (o11.getClass() != o12.getClass())
            System.out.println("Run time classes are different");

    }
}


class C11 {
    public int f1;
    protected int f2;
    public C11() {

    }
    public C11(int f1) {
        this.f1 = f1;
    }
    public void m1() {
        System.out.println("C1.m1()");
    }
    public void m1(int i) {
        System.out.println("C1.m1(int)");
    }

    private void m2() {
        System.out.println("C1.m2()");
    }
}

class C22 extends C11 {
    public void m3() {
        System.out.println("C2.m3()");
    }
    public void m4() {
        System.out.println("C2.m4()");
    }
}