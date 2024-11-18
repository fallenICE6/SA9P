package src.lab4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class zad4 {
    public static  void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        long startTime = System.nanoTime();
        addElements(list1);
        pickRandomElements(list1);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList time: " + estimatedTime + " ns");

        long startTime1 = System.nanoTime();
        addElements(list2);
        pickRandomElements(list2);
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("LinkedList time: " + estimatedTime1 + " ns");
    }
    public static void addElements(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }
    public static void pickRandomElements(List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < 100000; i++) {
            int randomIndex = rand.nextInt(list.size());
            list.get(randomIndex);
        }
    }
}
