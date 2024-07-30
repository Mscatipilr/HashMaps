import java.util.HashMap;

public class Program {

    // Method to print all keys in the hashmap
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    // Method to print keys in the hashmap which contain the given string
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    // Method to print values of keys in the hashmap which contain the given string
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String value : hashmap.keySet()) {
            if (value.contains(text)) {
                System.out.println(hashmap.get(value));
            }
        }
    }

    //Method to print all the values in the hashmap given as a parameter using the toString
    //method of the Book objects.
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book.toString());
        }

    }

    /**
     * Method to print only the Books in the given hashmap which name contains the given string. You can find out the name of a
     * Book with the method getName.
     */
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book.toString());
            }
        }

    }
}
