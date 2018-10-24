package com.ds.string;

public class DuplicateChar {
    private boolean isDuplicate(final String str) {

        int checker = 0;

        for (char c : str.toCharArray()) {
            if ((checker & (1 << c)) > 1) {
                return true;
            }
            checker |= (1 << c);
        }
        return false;
    }

    public static void main(final String[] args) {
        final DuplicateChar duplicateChar = new DuplicateChar();
        System.out.println(duplicateChar.isDuplicate("asdfa"));
    }
}
