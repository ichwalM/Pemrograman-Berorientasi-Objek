package Model;

public class Account {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void display(){
        System.out.println("Username \t: " + username);
        System.out.println("Password \t: " + password);
    }
}
