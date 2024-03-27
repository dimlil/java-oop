import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        
        for (int i = 0; i < 3; i++) {
            Book book = new Book();
            System.out.print("Book 1 Title: ");
            book.setTitle(scanner.nextLine());
            for (int j = 0; j < 2; j++) {
                Author author = new Author();
                System.out.print("Book 1 Author " + (j + 1) + ": ");
                author.setName(scanner.nextLine());
    
                Country country = new Country();
                System.out.print("Book 1 Author " + (j + 1) + " Country: ");
                country.setName(scanner.nextLine());
                author.setCountry(country);
                book.addAuthor(author);
            }
            books.add(book);
            System.out.println("");
        }

        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);

            System.out.print("Book " + (i + 1) + ": Title = " + b.getTitle());

            for (int j = 0; j < b.getAuthorsCount(); j++) {
                Author a = b.getAuthor(j);
                System.out.print(", Author" + (j + 1) + ": [Name = " + a.getName() + ", Country = " + a.getCountry().getName() + "]");
            }

            System.out.println("");
        }

        scanner.close();
    }
}
