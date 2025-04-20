import Model.Admin;
import Model.User;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.setUsername("Ichwal");
        admin.setPassword("123456");
        User user = new User("Irgi", "654321");
        
        admin.display();
        user.display();
    }
}