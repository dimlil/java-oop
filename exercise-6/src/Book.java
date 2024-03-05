public class Book {
    private String title;
    private Author[] authors;

    public Book(int authorsCounter){
        this.authors = new Author[authorsCounter];
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void addAuthor(Author author, int index){
        this.authors[index] = author;
    }
    public Author getAuthor(int index){
        return this.authors[index];
    }
    public int getAuthorCount(){
        return this.authors.length;
    }
}
