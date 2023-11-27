package oop.part12;

public class A {
    public void inheritedOutput() {
        System.out.println("Class A inherited output");
    }

    public void publicMethodCall() {
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Class A private method call");
    }

    public void output() {
        System.out.println("Class A output");
    }


}
