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


@WebServlet("/add")
public class AddServlet extends HttpServlet {

    private StudentService studentsService;

    public void init() {
        studentsService = new StudentService(new StudentsDao());
    }
    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("name");
        String averageScore = request.getParameter("average-score");
        String isBlockChain = request.getParameter("isBlockChain");

        String errorMessage = "";

        if (userName == null || userName.equals("")
                    || averageScore == null || averageScore.equals("")
                    || isBlockChain == null || isBlockChain.equals("")) {

            errorMessage += "One or several fields are empty.\n";
            SendMessage(request, response, errorMessage);
        }
        else if (!tryParseDouble(averageScore)) {
            errorMessage += "Not valida format.\n";
            SendMessage(request, response, errorMessage);
        }
        else if (studentsService.exists(userName)) {
            errorMessage += "Student has been existed:" + userName + "\n";
            SendMessage(request, response, errorMessage);
        }
        else if (Double.parseDouble(averageScore) < 0 || Double.parseDouble(averageScore) > 5){
            errorMessage += "Score cannot be  less 0 and better 5.\n";
        }

        if (!errorMessage.equals("")) {
            SendMessage(request, response, errorMessage);
        }
        else {
            Student student = new Student(userName, Float.parseFloat(averageScore), isBlockChain.equals("True"));
            studentsService.add(student);

            request.getRequestDispatcher("index.html").forward(request, response);
        }


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.html").forward(request, response);
    }

    private void SendMessage(HttpServletRequest request, HttpServletResponse response, String message) throws ServletException, IOException {
        request.setAttribute("errorMessage", message);
        request.getRequestDispatcher("error.jsp").forward(request, response);
    }

    private boolean tryParseDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }
}
