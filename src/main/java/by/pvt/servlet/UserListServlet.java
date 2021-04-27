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

@WebServlet(urlPatterns = "/users/list")
public class UserListServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<User> userList = UserService.getInstance().getUserList();

        req.setAttribute("userList", userList);
        req.getRequestDispatcher("/userList.jsp").forward(req, resp);
    }
}
