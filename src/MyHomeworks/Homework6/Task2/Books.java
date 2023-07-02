package MyHomeworks.Homework6.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Books {

    public static class BookManagement {
        private List<String> books;

        public BookManagement() {
            books = new ArrayList<>();
        }

        public void addBook(String bookTitle) {
            books.add(bookTitle);
        }

        public Map<Integer, String> getBookMap() {
            Map<Integer, String> bookMap = new HashMap<>();
            int index = 0;
            for (String book : books) {
                bookMap.put(index++, book);
            }
            return bookMap;
        }

        public static void main(String[] args) {
            {
                BookManagement bookManager = new BookManagement();

                // Add books to the ArrayList
                bookManager.addBook("Harry Potter");
                bookManager.addBook("Lord of the Rings");
                bookManager.addBook("The Great Gatsby");
                bookManager.addBook("The Odyssey");
                bookManager.addBook("Dune");

                // Get the book map
                Map<Integer, String> bookMap = bookManager.getBookMap();

                //foreach loop iterates over each entry
                for (Map.Entry<Integer, String> entry : bookMap.entrySet()) {
                    System.out.println("Key: " + entry.getKey() + ", Book: " + entry.getValue());
                }
            }
        }
    }
}