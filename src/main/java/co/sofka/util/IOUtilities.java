package co.sofka.util;

import org.jetbrains.annotations.NotNull;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class contains static methods for reading and writing data from user
 *
 * @author J Daniel - jdarce91@misena.edu.co
 */
public final class IOUtilities {
    private static final Scanner input = new Scanner(System.in);

    /**
     * This method asks user from a value and check if user input is valid. (isn't empty)
     *
     * @param value the value to be asked for
     * @return String validated user input
     */
    public static String askFor(String value) {

        String checkedItem;

        while (true) {
            try {
                System.out.print("\nPlease enter the " + value + ": ");
                checkedItem = input.next();

                if (checkedItem.trim().isEmpty()) {
                    throw new InputMismatchException();
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid " + value + ". Please try again.");
            }
        }

        return checkedItem;
    }

    public static Float askFor(String value, @NotNull Boolean isNumber) {

        String checkedItem;

        while (true) {
            try {
                System.out.print("\nPor favor digite el " + value + ": ");
                checkedItem = input.next();


                if (!checkedItem.trim().isEmpty() && ExpressionParser.isValid(checkedItem)) {
                    var list = checkedItem.chars().mapToObj(c -> (char) c).toList();

                    if (list.contains('.')) {
                        return Float.parseFloat(checkedItem);
                    } else {
                        return Float.parseFloat(checkedItem + ".0");
                    }
                }

                throw new InputMismatchException();

            } catch (InputMismatchException | NumberFormatException e) {
                e.getCause();
                System.out.println("Invalid " + value + ". Please try again.");
            }
        }
    }

    /**
     * This method asks user from a value in a numeric menu.
     *
     * @param title   the title of the menu
     * @param Options a String array of options     *
     * @return int validated user input
     */
    public static int menuMaker(String title, String @NotNull [] Options) {
        int counter = 1;

        while (true) {
            try {
                System.out.println("\n" + title);

                for (String option : Options) {
                    System.out.println(counter + ". " + option + " ");
                    counter++;
                }

                System.out.print("-> ");

                int selectedOption = input.nextInt();

                if (selectedOption < 1 || selectedOption > Options.length + 1) {
                    throw new InputMismatchException();
                }

                return selectedOption;

            } catch (InputMismatchException e) {
                System.out.println(
                        "Invalid option \"" + input.nextLine() + "\". Please try again.");
            }
        }
    }

    /**
     * This method asks user from a value in a numeric menu with an orientation option and an
     * optional back option.
     *
     * @param title       the title of the menu
     * @param Options     a String array of options
     * @param orientation the orientation of the menu true for vertical and false for horizontal
     * @param back        true if the menu has an option to go back to the previous menu
     * @return int validated user input
     */
    public static int menuMaker(String title,
                                String @NotNull [] Options,
                                boolean orientation,
                                boolean back) {
        int counter = 1;

        while (true) {
            try {
                System.out.println("\n" + title);

                if (!orientation) {
                    for (String option : Options) {
                        System.out.print(counter + "." + option + " | ");
                        counter++;
                    }

                } else {
                    for (String option : Options) {
                        System.out.println(counter + ". " + option + " ");
                        counter++;
                    }

                }
                if (back) {
                    System.out.print(counter + ".Back to previous menu");
                }
                System.out.print("\n\n-> ");

                int selectedOption = input.nextInt();

                if (selectedOption < 1 || selectedOption > Options.length + 1) {
                    throw new InputMismatchException();
                }

                return selectedOption;

            } catch (InputMismatchException e) {
                System.out.println(
                        "Invalid option \"" + input.nextLine() + "\". Please try again.");
            }
        }
    }
}


