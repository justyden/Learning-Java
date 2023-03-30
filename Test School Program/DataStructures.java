import java.util.*;

class CreateLinkedList {

    List<String> tempArrayList = new ArrayList<>();

    public void ShowList(ArrayList<String> tempArrayList) {
        for (String name : tempArrayList) {
            System.out.println(name);
        }
    }
}

class HashTable {

    Map<String, Double> scores = new Hashtable<>();

    double getScore(String inputName) {
        double studentScore = 0.0;

        if (scores.containsKey(inputName)) {
            studentScore = scores.get(inputName);
        }

        return studentScore;
    }

}

class FindWordCount {
    public static void WordCount(String inputString) {
        Map<String, Integer> tempHashTable = new Hashtable<>();

        String[] listOfWords = inputString.split(" ");

        for (String word : listOfWords) {
            if (tempHashTable.containsKey(word)) {
                Integer tempInt = tempHashTable.get(word) + 1;
                tempHashTable.put(word, tempInt);
            }

            else {
                tempHashTable.put(word, 1);
            }
        }

        System.out.println(tempHashTable);
    }
}