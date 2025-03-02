package guviproject;

class GrandParent {
    static void m1() {
        System.out.println("GrandParent m1 method");
    }
}

class Parent extends GrandParent {
    static void m1() {
        System.out.println("Parent m1 method");
        GrandParent.m1(); 
    }
}

class Child extends Parent {
    static void m1() {
        System.out.println("Child m1 method");
        Parent.m1(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Child.m1(); 
    }
}

