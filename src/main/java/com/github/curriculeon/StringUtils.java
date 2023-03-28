package com.github.curriculeon;
import java.util.Arrays;
import java.util.List;

public class StringUtils {
    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        if (string == null || indices == null) {
            throw new IllegalArgumentException("One or more of your inputted arguments is null.");
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int index : indices) {
            if (index < 0 || index >= stringBuilder.length()) {
                throw new IllegalArgumentException("Index out of range.");
            }
            stringBuilder.setCharAt(index, Character.toUpperCase(stringBuilder.charAt(index)));
        }
        return stringBuilder.toString();
    }


    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        if (stringToBeManipulated == null || valueToBeInserted == null || index == null) {
            throw new IllegalArgumentException("One of the values inputted to the method's argument(s) was null.");
        }
        if (index < 0 || index > stringToBeManipulated.length()) {
            throw new IllegalArgumentException("One of the values inputted to the method's argument(s) was not valid.");
        }
        StringBuilder stringBuilder = new StringBuilder(stringToBeManipulated);
        stringBuilder.insert(index, valueToBeInserted);
        return stringBuilder.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        if (stringToBeManipulated == null || replacementValue == null || index == null) {
            throw new IllegalArgumentException("One of the values inputted to the method's argument(s) was null.");
        }
        if (index < 0 || index > stringToBeManipulated.length()) {
            throw new IllegalArgumentException("One of the values inputted to the method's argument(s) was not valid.");
        }
        StringBuilder stringBuilder = new StringBuilder(stringToBeManipulated);
        stringBuilder.setCharAt(index, replacementValue);
        return stringBuilder.toString();
    }
}
