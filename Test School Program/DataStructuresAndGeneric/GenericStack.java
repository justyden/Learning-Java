package DataStructuresAndGeneric;

import java.util.*;

public class GenericStack<T> {
    private static final int INITIAL_SIZE = 16;
    private ArrayList<T> elements;
    private int size = 0;

    public GenericStack() {
        elements = new ArrayList<T>(INITIAL_SIZE);
    }

    public void push(T element) {
        elements.add(element);
        size++;
    }

    public T pop() {
        T result = elements.get(--size);
        elements.remove(size);
        return result;
    }

    public static <T> void genericStackDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }
}
