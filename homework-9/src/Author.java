public class Author implements Person {
    private String name;
    private Country country;
    
    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public void setCountry(Country country){
        this.country = country;
    }

    @Override
    public Country getCountry(){
        return this.country;
    }
}
