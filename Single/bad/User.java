package single;

import java.io.FileWriter;
import java.io.IOException;

public class User{
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    
    public void saveFile() {
        try (FileWriter fileWriter = new FileWriter(name + ".txt")) {
            fileWriter.write("Name" + name + '\n');
            fileWriter.write("Email" + email + '\n');
            System.out.println("User Data Saved to file Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public static void main(String[] args) {
        User user = new User("Ghada", "ghadaaemad561@gmail.com");
        user.saveFile();

    }
}
//bad desing : we do user data and save user data in the same class 
// so we need each class to responsible to only one job