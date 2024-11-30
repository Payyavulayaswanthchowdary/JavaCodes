package Exceptions;

public class ThrowExample {
    public static void checkAge(int age) {
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or older to proceed.");
            } else {
                System.out.println("Access granted.");
            }
        }

        public static void main(String[] args) {
            try {
                checkAge(16);
            } catch (IllegalArgumentException i) {
                System.out.println("Caught an exception: " + i.getMessage());
            }
            System.out.println("Program continues...");
        }
    }


