import java.util.Arrays;

class BasicArrays<T> {
    public void ShowList(T[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }
}

class CheckWords {
    public static String[] GetWords(String sentences) {
        String[] Array = sentences.split(" ");
        return Array;
    }
}

class CompareArray {
    public static boolean checksArrays(int[] inputArray1, int[] inputArray2) {
        boolean result = Arrays.equals(inputArray1, inputArray2);
        return result;
    }
}

class SearchArray {
    public static double FindMiddleIndex(double[] inputArray) {
        double[] copyArray = Arrays.copyOf(inputArray, inputArray.length);
        Arrays.sort(copyArray);
        int middle = copyArray.length / 2;
        return copyArray[middle];
    }

    public static void TraverseArray(String[] inputArray) {
        for (String word : inputArray) {
            System.out.println(word);
        }
    }
}
