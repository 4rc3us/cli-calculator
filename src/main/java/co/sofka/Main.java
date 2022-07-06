package co.sofka;

import static co.sofka.gui.Calculator.*;
import static co.sofka.util.IOUtilities.askFor;
import static co.sofka.util.IOUtilities.menuMaker;

public class Main {
    public static void main(String[] args) {

        while (true) {
            switch (menuMaker("CLI - Calculator",
                              new String[]{"Sumar", "Restar", "Multiplicar", "Dividir", "Salir"})) {

                case 1 -> {
                    addition(askFor("Primer valor", true), askFor("Segundo valor", true));
                }
                case 2 -> {
                    subtraction(askFor("Primer valor", true), askFor("Segundo valor", true));
                }
                case 3 -> {
                    multiplication(askFor("Primer valor", true), askFor("Segundo valor", true));
                }
                case 4 -> {
                    division(askFor("Primer valor", true), askFor("Segundo valor", true));
                }

                case 5 -> System.exit(0);
            }
        }
    }
}