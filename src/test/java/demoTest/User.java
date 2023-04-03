package demoTest;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    private String name;

    private int age;

    public void sayHi() {
        System.out.println("Hello from " + name);
    }

    public void login(String username, String password) {
        System.out.println("Login");
    }
}
