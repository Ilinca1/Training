package servlets;

import db.ConnectToDB;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by ivamesu on 7/29/2016.
 */
@WebServlet("/add")
public class AddUser extends HttpServlet {

    private ConnectToDB connect = new ConnectToDB();

    public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/addUser.jsp").forward(request, response);
    }

    public void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        final User user = new User();


        user.setName(request.getParameter("name"));
        user.setAge(Integer.parseInt(request.getParameter("age")));
        user.setPassword(request.getParameter("password"));


        PreparedStatement ps;
        System.out.println(user.toString());
        try {
            ps = connect.getConnection().prepareStatement("INSERT INTO info (name, password, age) VALUES (?,?,?)");

            ps.setString(1, user.getName());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getAge());

            ps.executeUpdate();
        } catch (final SQLException e) {
            e.printStackTrace();

        }

        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }

}