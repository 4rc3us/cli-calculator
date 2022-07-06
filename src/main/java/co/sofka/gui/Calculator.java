package co.sofka.gui;

public class Calculator {
    public static void addition(float number1, float number2) {
        float result = number1 + number2;
        System.out.println("\n\nEl resultado es: " + result);
    }

    public static void subtraction(float number1, float number2) {
        float result = number1 - number2;
        System.out.println("\n\nEl resultado es: " + result);
    }

    public static void multiplication(float number1, float number2) {
        float result = number1 * number2;
        System.out.println("\n\nEl resultado es: " + result);
    }

    public static void division(float number1, float number2) {
        float result = number1 / number2;
        System.out.println("\n\nEl resultado es: " + result);
    }
}