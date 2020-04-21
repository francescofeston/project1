import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BookStack {

    static class Book {
        public String title;
        public int pagesLeft;

        public Book(String title, int pages) {
            this.title = title;
            this.pagesLeft = pages;
        }

        public String getTitle() {
            return this.title;
        }

        public int getPages() {
            return this.pagesLeft;
        }

        public void read100Pages() {
            System.out.println("Reading 100 pages of " + this.title);
            this.pagesLeft = this.pagesLeft - 100;
        }

        public Boolean completed() {
            return this.pagesLeft <= 0;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Book book1 = new Book("Harry Potter", 200);
            Book book2 = new Book("Champak", 100);
            Book book3 = new Book("Lord of the Rings", 300);
            Book book4 = new Book("Tinkle", 100);


            Stack<Book> bookStack = new Stack<Book>();
            // Add code to push the books on the Stack here (in order:
            // book1,book2,book3,book4)
            bookStack.push(book1);
            bookStack.push(book2);
            bookStack.push(book3);
            bookStack.push(book4);

            while (!bookStack.isEmpty()) {
                Book item = bookStack.peek();
                //System.out.println("Book at the top of the stack is: " + item.getTitle());
                while (!item.completed()) {
                    item.read100Pages();
                }
                bookStack.pop();
                for (int i = bookStack.size() - 1; i >= 0; i--) {
                    //System.out.println(bookStack.get(i).getTitle());
                }

                //System.out.println(Arrays.toString(bookStack.toArray()));

                // Add code to pick the book at the top and read 100 pages
                // Remove the book from the stack if it is completed


            }
        }
    }
}


