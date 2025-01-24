package day12.inherent;

public class Child extends Parent{
    int field;

    @Override
    void parentMethod() {
        System.out.print("Called in Child class -> ");
        super.parentMethod();
    }

    void childMethod() {
        System.out.println("Child.childMethod");
    }
}
