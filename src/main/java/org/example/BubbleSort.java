package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BubbleSort {

    public <T extends Comparable<T>> List<T> sort(List<T> input) {
        if (input == null) {
            throw new RuntimeException("Input is null.");
        }
        List<T> modifiable = new ArrayList<>(input);
        modifiable.removeIf(Objects::isNull);
        boolean allSorted = false;
        while (!allSorted) {
            allSorted = true;
            for (int i = 0; i < modifiable.size() - 1; i++) {
                if (modifiable.get(i).compareTo(modifiable.get(i + 1)) > 0) {
                    allSorted = false;
                    Collections.swap(modifiable, i, i + 1);
                }
            }
        }
        return modifiable;
    }
}
