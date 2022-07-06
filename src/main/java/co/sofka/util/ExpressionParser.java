package co.sofka.util;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionParser {
    public static boolean isValid(@NotNull String expression) {
        Pattern pattern = Pattern.compile("(-*\\d+(\\.\\d+)?\\)*)*");
        Matcher matcher = pattern.matcher(removeSpaces(expression));

        return matcher.matches();
    }

    public static String removeSpaces(@NotNull String expression) {
        return expression.replaceAll("\\s", "");
    }

    public static List<Integer> getOperators(@NotNull String expression) {

        final Pattern operators = Pattern.compile("[+\\-*/%^]");
        final Matcher matcher   = operators.matcher(removeSpaces(expression));

        final ArrayList<Integer> operatorsList = new ArrayList<>();

        while (matcher.find()) {
            operatorsList.add(matcher.start());
        }

        return operatorsList;
    }

    public static List<Integer> getDigits(@NotNull String expression) {
        final Pattern digits  = Pattern.compile("[\\d\\.]");
        final Matcher matcher = digits.matcher(removeSpaces(expression));

        final ArrayList<Integer> digitsList = new ArrayList<>();

        while (matcher.find()) {
            digitsList.add(matcher.start());
        }

        return digitsList;
    }
}