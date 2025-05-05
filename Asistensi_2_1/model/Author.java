package model;

public class Author {
    private int id;
    private String firstName,lastName;
    
    public Author(int id, String firstName, String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    
}
