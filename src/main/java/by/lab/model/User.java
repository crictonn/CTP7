package by.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class User {
    private int id;
    private String login;
    private byte[] passw;

    public User(String login, byte[] passw) {
        this.login = login;
        this.passw = passw;
    }
}
