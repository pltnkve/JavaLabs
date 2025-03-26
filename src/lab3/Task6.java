package lab3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task6 {
    public static void main(String[] args) {
        int N = 100000;

        ArrayList<Integer> arrayList = new ArrayList<>(N);
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime = System.currentTimeMillis();
        int result = peopleArrayList(arrayList);
        long endTime = System.currentTimeMillis();

        System.out.println("ArrayList");
        System.out.println("Остался человек с номером " + result);
        System.out.println("Время выполнения:" + (endTime - startTime) + "\n");

        startTime = System.currentTimeMillis();
        result = peopleLinkedList(linkedList);
        endTime = System.currentTimeMillis();

        System.out.println("LinkedList");
        System.out.println("Остался человек с номером " + result);
        System.out.println("Время выполнения:" + (endTime - startTime) + "\n");
    }

    public static int peopleArrayList(ArrayList<Integer> arrayList) {
        while (arrayList.size() > 1) {
            for (int i = 0; i < arrayList.size(); i++) {
                if ((i % 2 == 1) || ((i / 2) % 2 == 1)) {
                    arrayList.remove(i);
                }
            }
        }
        return arrayList.getFirst();
    }

    public static int peopleLinkedList(LinkedList<Integer> linkedList) {
        while (linkedList.size() > 1) {
            for (int i = 0; i <  linkedList.size(); i++) {
                if ((i % 2 == 1) || ((i / 2) % 2 == 1)) {
                    linkedList.remove(i);
                }
            }
        }
        return linkedList.getFirst();
    }
}
