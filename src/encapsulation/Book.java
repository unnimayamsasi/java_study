package encapsulation;

public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public void printDetails(){
        System.out.println("Book Details: ");
        System.out.println("ID: " +id);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
}

    public static void main(String[] args) {
        Book book1 =new Book(1,"To Kill a Mockingbird","Harper Lee");
        book1.printDetails();

    }
}
