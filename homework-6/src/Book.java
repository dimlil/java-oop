public class Book {
    private String title;
    private Author[] authors;
    private int nextIndex;
    // public void setNextIndex(int nextIndex){
    //     this.nextIndex = nextIndex;
    // }
    // public int getNextIndex(){
    //     return nextIndex;
    // }

    public Book(int authorsCounter){
        this.authors = new Author[authorsCounter];
        this.nextIndex = 0;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void addAuthor(Author author, int index){
        this.authors[index] = author;
        this.nextIndex++;
    }
    public Author getAuthor(int index){
        return this.authors[index];
    }
    public int getAuthorCount(){
        return this.authors.length;
    }
}
