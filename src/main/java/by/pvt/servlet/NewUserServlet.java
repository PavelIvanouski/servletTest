package by.pvt.servlet;

import by.pvt.model.User;
import by.pvt.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/users/new")
public class NewUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/newUser.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService.getInstance().addUser(req.getParameter("fName"),req.getParameter("lName"));

        List<User> userList = UserService.getInstance().getUserList();

        req.setAttribute("userList", userList);

        req.getRequestDispatcher("/userList.jsp").forward(req,resp);
    }
}
