import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Book book = new Book(3);
        System.out.print("Book title: ");
        book.setTitle(scanner.nextLine());
        for(int i = 0; i < book.getAuthorCount(); i++){
            Author author = new Author();
            System.out.print("Author " + (i + 1) + " name: ");
            author.setName(scanner.nextLine());
            book.addAuthor(author, i);
            System.out.print("Author " + (i + 1) + " country: ");
            Country country = new Country();
            country.setName(scanner.nextLine());
            author.setCountry(country);
        }
        System.out.println("");

        System.out.println("Book: "+book.getTitle());
        for(int i = 0; i < book.getAuthorCount(); i++){
            System.out.println("Author " + (i + 1) + ": Name = " + book.getAuthor(i).getName() + ", Country = " + book.getAuthor(i).getCountry().getName());
        }
    }
}
