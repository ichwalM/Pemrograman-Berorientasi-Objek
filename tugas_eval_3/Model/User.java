package Model;

public class User  extends Account {
    public void display(){
        System.out.println("---*Sebagai User*---");
        super.display();
    }
    public User(String username, String password) {
        super.setUsername(username);
        super.setPassword(password);
    }
}
