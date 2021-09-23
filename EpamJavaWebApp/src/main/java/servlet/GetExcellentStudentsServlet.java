package servlet;

import entities.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.StudentService;
import services.StudentsDao;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/exel")
public class GetExcellentStudentsServlet extends HttpServlet {

    private StudentService studentsService;

    public void init() {
        studentsService = new StudentService(new StudentsDao());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        var students = studentsService.getExcellentStudents();
        request.setAttribute("students", students);
        request.getRequestDispatcher("students.jsp").forward(request, response);
    }
}
