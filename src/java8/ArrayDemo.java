package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 3, 5);
        List<List<Integer>> powerSet = generatePowerSet(input);

        System.out.println("{");
        for (List<Integer> subset : powerSet) {
            System.out.println(subset);
        }
        System.out.println("}");
    }

    public static List<List<Integer>> generatePowerSet(List<Integer> input) {
        List<List<Integer>> powerSet = new ArrayList<>();
        generatePowerSetHelper(input, 0, new ArrayList<>(), powerSet);
        return powerSet;
    }

    private static void generatePowerSetHelper(List<Integer> input, int index, List<Integer> current, List<List<Integer>> powerSet) {
        if (index == input.size()) {
            powerSet.add(new ArrayList<>(current));
            return;
        }

        // Include the current element
        current.add(input.get(index));
        generatePowerSetHelper(input, index + 1, current, powerSet);

        // Exclude the current element
        current.remove(current.size() - 1);
        generatePowerSetHelper(input, index + 1, current, powerSet);
    }
}
