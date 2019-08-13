package ru.maxx129.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//@WebServlet("/users")
public class UsersServlet extends HttpServlet {

    private Connection connection;

    @Override
    public void init() throws ServletException {
        Properties properties = new Properties();

        //UsersServlet usersServlet = new UsersServlet();
        //String webAppPath = getServletContext().getRealPath("/");
        //FileInputStream fileInputStream =  new FileInputStream();

        try {
            properties.load(new FileInputStream("C:/Users/Max/IdeaProjects/db/src/main/resources/db.properties"));
            String dbUrl = properties.getProperty("db.url");
            String dbUserName = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");
            String driverClassName = properties.getProperty("db.driverClassName");

            Class.forName(driverClassName);

            connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        }
        catch (IOException e) {
            throw new IllegalStateException(e);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext().getRequestDispatcher("/jsp/addUser.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("first-name");
        String lastName = req.getParameter("last-name");

        try {
            Statement statement = connection.createStatement();

//            Возможна sql injection
//            String sqlInsert = "INSERT INTO users (first_name, last_name)" +
//                  "VALUES('" + firstName + "', '" + lastName + "');";
//            System.out.println(sqlInsert);
//           statement.execute(sqlInsert);

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (first_name, last_name) VALUES (?, ?)");
            preparedStatement.setString(1, "firstName");
            preparedStatement.setString(2, "lastName");
            preparedStatement.execute();



        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

    }
}
