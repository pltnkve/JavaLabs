package lab3;

import java.util.*;

public class TaskCollectionComparing {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        List<Integer> arrayList = new ArrayList<>();

        System.out.println("Время выполнения операции добавления (в конец) HashSet = "
                            + getSetAddLastRunningTime(hashSet));
        System.out.println("Время выполнения операции добавления (в конец) TreeSet = "
                            + getSetAddLastRunningTime(treeSet));
        System.out.println("Время выполнения операции добавления (в конец) ArrayList = "
                            + getListAddLastRunningTime(arrayList));

        System.out.println("Время выполнения операции добавления (в начало) TreeSet = "
                + getSetAddFirstRunningTime(treeSet));
        System.out.println("Время выполнения операции добавления (в начало) ArrayList = "
                + getListAddFirstRunningTime(arrayList));

        System.out.println("Время выполнения операции добавления (в середину) TreeSet = "
                + getSetAddMiddleRunningTime(treeSet));
        System.out.println("Время выполнения операции добавления (в середину) ArrayList = "
                + getListAddMiddleRunningTime(arrayList));

        System.out.println("Время выполнения операции удаления (из начала) HashSet = "
                + getSetRemoveFirstRunningTime(hashSet));
        System.out.println("Время выполнения операции удаления (из начала) TreeSet = "
                + getSetRemoveFirstRunningTime(treeSet));
        System.out.println("Время выполнения операции удаления (из начала) ArrayList = "
                + getListRemoveFirstRunningTime(arrayList));

        System.out.println("Время выполнения операции удаления (из середины) HashSet = "
                + getSetRemoveMiddleRunningTime(hashSet));
        System.out.println("Время выполнения операции удаления (из середины) TreeSet = "
                + getSetRemoveMiddleRunningTime(treeSet));
        System.out.println("Время выполнения операции удаления (из середины) ArrayList = "
                + getListRemoveMiddleRunningTime(arrayList));

        System.out.println("Время выполнения операции удаления (с конца) HashSet = "
                + getSetRemoveLastRunningTime(hashSet));
        System.out.println("Время выполнения операции удаления (с конца) TreeSet = "
                + getSetRemoveLastRunningTime(treeSet));
        System.out.println("Время выполнения операции удаления (с конца) ArrayList = "
                + getListRemoveLastRunningTime(arrayList));

        System.out.println("Время выполнения операции получения по индексу HashSet = "
                + getSetGetIndexRunningTime(hashSet));
        System.out.println("Время выполнения операции получения по индексу TreeSet = "
                + getSetGetIndexRunningTime(treeSet));
        System.out.println("Время выполнения операции получения по индексу ArrayList = "
                + getListGetIndexRunningTime(arrayList));
    }

    private static long getSetAddLastRunningTime(Set<Integer> set){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 8000000; i++) {
            set.add(i);
        }

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getListAddLastRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 8000000; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getSetAddFirstRunningTime(Set<Integer> set){
        long start = System.currentTimeMillis();

        set.add(-1);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getListAddFirstRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();

        list.addFirst(-1);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getSetAddMiddleRunningTime(Set<Integer> set){
        long start = System.currentTimeMillis();

        set.add(500000);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getListAddMiddleRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();

        list.add(500000, -2);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getSetRemoveFirstRunningTime(Set<Integer> set){
        long start = System.currentTimeMillis();

        set.remove(0);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getListRemoveFirstRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();

        list.removeFirst();

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getSetRemoveMiddleRunningTime(Set<Integer> set){
        long start = System.currentTimeMillis();

        set.remove(500000);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getListRemoveMiddleRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();

        list.remove(500000);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getSetRemoveLastRunningTime(Set<Integer> set){
        long start = System.currentTimeMillis();

        set.remove(1000000);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getListRemoveLastRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();

        list.removeLast();

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getSetGetIndexRunningTime(Set<Integer> set){
        long start = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>(set);
        list.get(999997);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getListGetIndexRunningTime(List<Integer> list){
        long start = System.currentTimeMillis();

        list.get(999997);

        long end = System.currentTimeMillis();

        return end - start;
    }
}
