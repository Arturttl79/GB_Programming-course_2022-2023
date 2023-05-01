package Controllers;

import StudentDomain.User;

public interface iUserController<T extends User> {
    void create(String firstName, String lastName, int age);
}
