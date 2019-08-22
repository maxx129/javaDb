package ru.maxx129.servlet;

<<<<<<< HEAD

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
=======
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
>>>>>>> 927f1c84733786ebb30b93e0ba8706c6892fe451

@WebServlet("/test")
public class TestServlet extends HttpServlet {

<<<<<<< HEAD
=======
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getServletContext().getRequestDispatcher("/jsp/test.jsp").forward(req, resp);
    }

>>>>>>> 927f1c84733786ebb30b93e0ba8706c6892fe451

}
