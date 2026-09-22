package org.tnsif.javaprograms.basics;

public class StaticConceptDemo {

    final static int x = 10;

    private int y;

    static void m1() {
        int z = 10;

        System.out.println(x);
        // System.out.println(y);  
        System.out.println(z);
    }

    void m2() {
        System.out.println(x);
        System.out.println(y);

        // z cannot be accessed because it is local to m1()
        // System.out.println(z);
    }

    static {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        StaticConceptDemo obj = new StaticConceptDemo();

        m1();
        obj.m2();
    }
}