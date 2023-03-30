package DataStructuresAndGeneric;

import java.util.*;

public class GenericQueue<T> {
    private static final int INITIAL_SIZE = 16;
    private ArrayList<T> elements;
    private int size;

    public GenericQueue() {
        elements = new ArrayList<T>(INITIAL_SIZE);
    }

    public void add(T element) {
        elements.add(size++, element);
    }

    public T remove() {
        T result = elements.get(0);
        elements.remove(0);
        --size;
        return result;
    }

    public static <T> void genericQueueDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }
}
