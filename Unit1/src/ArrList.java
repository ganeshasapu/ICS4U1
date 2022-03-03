//Ganesh A.
//March 2, 2022
//Creating 3 instances of the Book class and adding them to arraylist -- Modifying and printing out Arraylist
import java.util.List;
import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        //Creating Array List 1
        List<Book> books = new ArrayList<Book>();

        //Creating 3 instances of the Book variable
        Book book1 = new Book("Frankenstein", "Mary Shelley", 1931);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 2013);
        Book book3 = new Book("Life of Pi", "Yann Martel", 2001);

        //Adding the 3 objects to the ArrayList
        books.add(book1);
        books.add(book2);
        books.add(book3);

        //Looping through the ArrayList and using the printInfo method to get information about it

        for (Book book : books) {
            book.printInfo();
        }

        //Removing book at index 0 (Frankenstein)
        books.remove(0);
        //Removing book at index 1 (Life of Pi) -- note that the array shifted once we removed the last book
        books.remove(1);

        //spacing
        System.out.println("\n\n");


        //Re-printing the array
        for (Book book : books) {
            book.printInfo();
        }

        //Re-adding books 1 and 3
        books.add(book1);
        books.add(book3);
        

        //Using removeIf method to remove the book object if the publishing date  == 2001
        //books.removeIf(book -> (book.getPublishDate() == 2001));


        //Alternative Method:
        //Since Java will not allow you to remove an object while iterating over it, you can add the objects you want to remove to a new list and use the removeAll() method

        //Creating ArrayList for objects that need to be removed
        List<Book> toRemove = new ArrayList<Book>();

        //Looping through ArrayList
        for (Book book : books) {
            //if the publish date is equal to 1931
            if (book.getPublishDate() == 1931){
                //Add the book to the toRemove ArrayList
                toRemove.add(book);
            }
        }
        //Using removeAll method to remove the values that are within toRemove ArrayList
        //Can also loop through toRemove and remove the objects from the books ArrayList
        books.removeAll(toRemove);

        //spacing
        System.out.println("\n\n");

        //Re-printing the array
        for (Book book : books) {
            book.printInfo();
        }
    }
}
