package io.github.concrafter20.configcraft.config;

public class Tools {
    public static Boolean containsIllegalChar(String string, String illegalChars) {

        for (char c : string.toCharArray()) {
            if (illegalChars.indexOf(c) != -1) {
                return true;
            }
        }

        return false;
    }

}
