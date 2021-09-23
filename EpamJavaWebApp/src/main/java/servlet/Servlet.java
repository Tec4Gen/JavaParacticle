package servlet;

import services.StorageData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        var students = StorageData.students;
        request.setAttribute("students", students);
        var dispatcher = request.getRequestDispatcher("/students.jsp");

        dispatcher.forward(request, response);
    }
}