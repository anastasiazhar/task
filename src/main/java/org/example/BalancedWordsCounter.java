package org.example;

import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {

    public int count(String input) {
        if (input == null) {
            throw new RuntimeException("Input is null.");
        }
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                throw new RuntimeException("The string contains symbols other than letters.");
            }
        }
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int j = i; j < chars.length; j ++) {
                if (map.containsKey(chars[j])) {
                    map.put(chars[j], map.get(chars[j]) + 1);
                } else {
                    map.put(chars[j], 1);
                }
                int num = map.get(chars[j]);
                boolean balanced = true;
                for (Integer n : map.values()) {
                    if (n != num) {
                        balanced = false;
                    }
                }
                if (balanced) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
