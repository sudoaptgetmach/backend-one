package org.mach.src.oop.exercicios.utils;

public class NumsUtils {

    public NumsUtils() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static boolean isNaN(String str) {
        if (str == null) {
            return true;
        }
        try {
            Double.parseDouble(str);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
}