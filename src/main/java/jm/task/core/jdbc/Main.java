package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASS = "1102";

    public static void main(String[] args)
    {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        System.out.println("Created db..");

        userService.saveUser("Vitya", "First", (byte) 23);
        userService.saveUser("Max", "Second", (byte) 22);
        userService.saveUser("Oleg", "Third", (byte) 44);
        userService.saveUser("Misha", "Last", (byte) 21);

        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
