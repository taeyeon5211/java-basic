package day12.inherent;

public class InherentMain {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        int parentField = p.field;
        int childField = c.field;
        System.out.println("parentField = " + parentField);
        System.out.println("childField = " + childField);
        p.parentMethod();
        c.parentMethod();
        c.childMethod();

        Parent p1 = new Child();
        p1.parentMethod();

        Child c1 = (Child) p1;
        c1.parentMethod();
        c1.childMethod();
    }
}
