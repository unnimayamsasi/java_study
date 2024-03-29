package encapsulation;

public class BookStore {
    public static void main(String[] args) {
        Book[] books=new Book[5];
        books[0]=new Book(1,"To kill a mockingbird","Harper Lee");
        books[1]=new Book(2,"1984","George Orwell");
        books[2] = new Book(3, "Pride and Prejudice", "Jane Austen");
        books[3] = new Book(4, "The Great Gatsby", "F. Scott Fitzgerald");
        books[4] = new Book(5, "The Catcher in the Rye", "J.D. Salinger");

        //print details of all books
        System.out.println("Details of all books: ");
        for (Book book:books){
            book.printDetails();
        }
        int SearchId=3;
        boolean found=false;
        System.out.println("Details of book with ID" +SearchId+ ":");
        for (Book book:books){
            if (book.getId()==SearchId){
                book.printDetails();
                break;
            }else {
                System.out.println("Id not found");

            }

        }

    }
}
