package servlets;

import db.ConnectToDB;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivamesu on 7/28/2016.
 */
@WebServlet("/all-users-servlet")
public class AllUsersServlet extends HttpServlet {
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("userList", getUsers(request));

        request.getRequestDispatcher("/users").forward(request, response);
    }

    private List<User> getUsers(final HttpServletRequest request) {
        final List<User> userList = new ArrayList<User>();
        ConnectToDB connect = new ConnectToDB();

        ResultSet rs;
        try {
            rs = connect.getConnection().prepareStatement("select * from info;").executeQuery();

            while (rs.next()) {
                final User user = new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setAge(rs.getInt(4));

                userList.add(user);
            }
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

}
