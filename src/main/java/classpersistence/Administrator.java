package classpersistence;

import classpersistence.User;

public class Administrator extends User {
    private String Email;

    public Administrator() {
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
