package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;



public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Ivan1", "LastName1", (byte) 10);
        userDao.saveUser("Ivan2", "LastName2", (byte) 45);
        userDao.saveUser("Ivan3", "LastName3", (byte) 12);
        userDao.saveUser("Ivan4", "LastName4", (byte) 22);

        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
