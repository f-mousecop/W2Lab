package org.charles;

public class UserInput {

    public static String readName() {
        String name;

        do {
            name = IO.readln("Please enter your name: ").trim();

            if (name.isBlank()) {
                IO.println("Name cannot be blank");
            } else if (!name.matches("[a-zA-Z]+")) {
                IO.println("Please enter a valid name");
            }


        } while (name.isBlank() || !name.matches("[a-zA-Z]+"));

        return name;
    }

    public static int readAge() {
        while (true) {
            String input = IO.readln("Please enter your age: ");

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                IO.println("Please enter a valid whole number");
            }
        }
    }
}
