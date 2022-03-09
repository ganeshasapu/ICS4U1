public class Book {
    private String title;
    private String authorName;
    private int publishDate;
    public Book(String bookTitle, String bookAuthorName, int bookPublishDate ){
        title = bookTitle;
        authorName = bookAuthorName;
        publishDate = bookPublishDate;
	}
    public void printInfo(){
        //method to print basic info
        System.out.printf("Title: %s | Author: %s | Publishing Year: %d | %n", title, authorName, publishDate);
    }
    public int getPublishDate(){
        //method to get the publishing date of book
        return publishDate;
    }
}
