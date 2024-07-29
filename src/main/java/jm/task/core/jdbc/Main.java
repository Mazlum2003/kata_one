package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();


        // Создание таблицы
        userDao.createUsersTable();
        System.out.println("Таблица users создана");

        userDao.saveUser("Иван", "Иванов", (byte) 25);
        userDao.saveUser("Максим", "Максимов", (byte) 30);
        userDao.saveUser("Олег", "Олегов", (byte) 35);
        userDao.saveUser("Анна", "Анисимова", (byte) 28);

        // Получение всех пользователей
        List<User> users = userDao.getAllUsers();
        System.out.println("Все пользователи в базе данных:");
        for (User user : users) {
            System.out.println(user);
        }

        // Очистка таблицы
        userDao.cleanUsersTable();
        System.out.println("Таблица users очищена");

        // Удаление таблицы
        userDao.dropUsersTable();
        System.out.println("Таблица users удалена");



    }
}








