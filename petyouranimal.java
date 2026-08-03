import java.util.Scanner;

// Parent Class
class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    // Method to be overridden
    void sound() {
        System.out.println(name + " makes a sound.");
    }

    // -------- METHOD OVERLOADING --------

    // No parameter
    void feed() {
        System.out.println(name + " is eating its regular food.");
    }

    // One parameter
    void feed(String food) {
        System.out.println(name + " is happily eating " + food + ".");
    }
}

// Child Class
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    // -------- METHOD OVERRIDING --------
    @Override
    void sound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

// Another Child Class
class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    // -------- METHOD OVERRIDING --------
    @Override
    void sound() {
        System.out.println(name + " says: Meow!");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Animal Interaction =====");

        System.out.print("Enter your pet's name: ");
        String name = input.nextLine();

        System.out.println("\nChoose your pet");
        System.out.println("1. Dog");
        System.out.println("2. Cat");

        System.out.print("Choice: ");
        int choice = input.nextInt();
        input.nextLine();

        Animal pet;

        if (choice == 1) {
            pet = new Dog(name);
        } else {
            pet = new Cat(name);
        }

        System.out.println("\nWhat would you like to do?");
        System.out.println("1. Hear the sound");
        System.out.println("2. Feed normal food");
        System.out.println("3. Feed custom food");

        System.out.print("Choice: ");
        int action = input.nextInt();
        input.nextLine();

        switch(action) {

            case 1:
                // Calls the overridden method
                pet.sound();
                break;

            case 2:
                // Overloaded method (no parameter)
                pet.feed();
                break;

            case 3:
                System.out.print("Enter food name: ");
                String food = input.nextLine();

                // Overloaded method (with parameter)
                pet.feed(food);
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        input.close();
    }
}
