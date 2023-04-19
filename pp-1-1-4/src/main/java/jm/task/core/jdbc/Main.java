package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService usi = new UserServiceImpl() {
            @Override
            public void createUsersTable() {

            }

            @Override
            public void dropUsersTable() {

            }

            @Override
            public void saveUser(String name, String lastName, byte age) {

            }

            @Override
            public void removeUserById(long id) {

            }

            @Override
            public List<User> getAllUsers() {
                return null;
            }

            @Override
            public void cleanUsersTable() {

            }
        };

/*
        usi.createUsersTable();
        usi.saveUser("Ivan", "Ivanov", (byte) 18);
        usi.saveUser("Petr", "Petrov", (byte) 21);
        usi.saveUser("Sveta", "Svetikova", (byte) 45);
        usi.saveUser("Rodion", "Rodionov", (byte) 60);
        usi.getAllUsers();
        usi.cleanUsersTable();
        usi.dropUsersTable();
*/

    }
}
