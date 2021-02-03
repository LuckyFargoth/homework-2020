package homeworks.iostreams;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@ToString
@AllArgsConstructor
public class Person implements Serializable {
    private final String login;
    private final transient String password;
}
