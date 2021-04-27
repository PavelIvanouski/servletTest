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

@WebServlet(urlPatterns = "/users/delete")
public class UserDeleteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String parameter = req.getParameter("userId");

        Integer userId = Integer.valueOf(parameter);

        UserService.getInstance().deleteUser(userId);

        List<User> userList = UserService.getInstance().getUserList();

        req.setAttribute("userList", userList);

        req.getRequestDispatcher("/userList.jsp").forward(req, resp);
    }
}
