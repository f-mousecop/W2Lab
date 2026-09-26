package org.charles;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //TIP Hello
    static void main() {
        IO.println(Triangle.isTriangle(1,1,1));

        String name = UserInput.readName();
        int age = UserInput.readAge();

        SomethingSomething something = new SomethingSomething(name, age);

        IO.println(something.getName() + " " + something.getAge());
    }
}
