package servlets;

import db.ConnectToDB;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

/**
 * Created by ivamesu on 7/28/2016.
 */
@WebServlet("/user-servlet")
public class UserServlet extends HttpServlet {

    private ConnectToDB connect;


    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        final int id = Integer.parseInt(request.getParameter("id"));
        final User user = new User();
        boolean userFound = false;

        PreparedStatement ps = null;
        connect = new ConnectToDB();

        try {
            PreparedStatement preparedStatement = connect.getConnection().prepareStatement("SELECT * FROM info WHERE id = " + id);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();
            if (rs.next()) {
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setAge(rs.getInt("age"));
                user.setId(rs.getInt("id"));
                userFound = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("user", user);
        request.getRequestDispatcher("/updateUser.jsp").forward(request, response);

    }

    @Override
    public void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        final User user = new User();
        final String button = request.getParameter("button");

        user.setId(Integer.parseInt(request.getParameter("userId")));
        user.setName(request.getParameter("name"));
        user.setAge(Integer.parseInt(request.getParameter("age")));
        user.setPassword(request.getParameter("pass"));
        boolean userFound = true;

        PreparedStatement ps;
        if ("Update".equals(button)) {
            try {
                System.out.println(user.toString());
                ps = connect.getConnection().prepareStatement("UPDATE info SET name = ?,password=?, age = ? WHERE id = ?;");

                ps.setString(1, user.getName());
                ps.setString(2, user.getPassword());
                ps.setInt(3, user.getAge());
                ps.setInt(4, user.getId());

                ps.executeUpdate();
            } catch (final SQLException e) {
                e.printStackTrace();
                userFound = false;
            }

            request.setAttribute("user", user);
            request.setAttribute("userFound", userFound);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            try {
                ps = connect.getConnection().prepareStatement("DELETE FROM info WHERE id= ?;");

                ps.setInt(1, user.getId());

                ps.executeUpdate();
            } catch (final SQLException e) {
                e.printStackTrace();
            }
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }


}

