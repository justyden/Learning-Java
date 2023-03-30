import java.util.ArrayList;

import FileOperations.FileCommands;
import Testing.TestRun;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> elements = new Stack<>();
        elements.Push(4);
        System.out.println(elements.pop());
    }
}

class Stack<T> {
    static final int INITIALSIZE = 16;
    private ArrayList<T> elements;
    private int size = 0;

    public Stack() {
        elements = new ArrayList<T>(INITIALSIZE);
    }

    public void Push(T input) {
        if (size != INITIALSIZE) {
            elements.add(input);
            size++;
        } else {
            System.out.println("The size if full.");
        }
    }

    public T pop() {
        if (size != 0) {
            T item;
            item = elements.get(size - 1);
            elements.remove(size - 1);
            --size;
            return item;
        } else {
            System.out.println("There were no more items in the array list.");
            return null;
        }
    }
}
