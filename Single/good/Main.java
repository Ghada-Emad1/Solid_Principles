package Single.good;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ghada", "ghadaaemad561@gmail.com");
        SaveFile sv = new SaveFile();
        sv.saveFile(user);

    }

}

class User {
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

}

class SaveFile {
    public void saveFile(User user) {
        try (FileWriter fileWriter = new FileWriter(user.getName() + ".txt")) {
            fileWriter.write("Name" + user.getName() + '\n');
            fileWriter.write("Email" + user.getEmail() + '\n');
            System.out.println("User Data Saved to file Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
