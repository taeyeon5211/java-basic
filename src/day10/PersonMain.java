package day10;

import day10.dto.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person sm = new Person();
        //sm.name = "김선민";
        sm.setName("김선민");
        sm.setAge(24);
        sm.setPhone("010-5657-8909");

        Person mg = new Person("최문규", 27, "010-8787-8989");


        Person ty = new Person("taeyeon", 27, "010-8742-3786");
        System.out.println(ty.getName() + " " + ty.play());
        System.out.println(ty.getName() + " " + ty.eat());
        System.out.println(ty.getName() + " " + ty.walk());

        System.out.println(sm);
        System.out.println(mg);
    }
}
