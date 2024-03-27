public class Author implements Person {
    private String name;
    
    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }
}
