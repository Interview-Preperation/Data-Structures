package com.ds.string;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    private final String s1;
    private final String s2;

    Isomorphic(final String s1, final String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    private boolean isIsomorphic() {

        if (null == s1 || null == s2) return false;

        if (s1.length() != s2.length()) return false;

        final Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            final char c1 = s1.charAt(i);
            final char c2 = s2.charAt(i);

            if (map.containsKey(c1)) {
                if (c2 != map.get(c1)) {
                    return false;
                }
            } else {
                if (map.containsValue(c2)) {
                    return false;
                }
                map.put(c1, c2);
            }
        }
        return true;
    }

    public static void main(final String[] args) {
        final String s1 = "Hello";
        final String s2 = "hrhhp";
        final Isomorphic isomorphic = new Isomorphic(s1, s2);
        System.out.println(isomorphic.isIsomorphic());
    }
}
