//package services;
//
//
//import javax.servlet.*;
//import java.io.IOException;
//
//public class ValidationFilter implements Filter {
//    public ValidationFilter() { }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response,
//                         FilterChain chain)
//            throws IOException, ServletException {
//
//        String errorMessage = "valError.jsp";
//
//        String userName = request.getParameter("name");
//        String averageScore = request.getParameter("average-score");
//        String isBlockChain = request.getParameter("isBlockChain");
//
//        if (userName == null || userName.equals("")
//                || averageScore == null || averageScore.equals("")
//                || isBlockChain == null || isBlockChain.equals("")) {
//
//            request.setAttribute("errorMessage", "Fields cannot be null");
//
//            RequestDispatcher rd = request.getRequestDispatcher(errorMessage);
//            rd.include(request, response);
//
//        }
//
//        boolean validName = StudentValidator.nameValidator(userName);
//        boolean validAverageScore = StudentValidator.averageScoreValidator(userName);
//        boolean validIsBlockChain = StudentValidator.isBlockChainValidator(userName);
//
//        if (!validName) {
//            request.setAttribute("errMsg", "Name format not valid");
//            RequestDispatcher rd = request.getRequestDispatcher(errorMessage);
//            rd.include(request, response);
//        }
//        else if(!validAverageScore) {
//            request.setAttribute("errMsg", "Average Score format not valid");
//            RequestDispatcher rd = request.getRequestDispatcher(errorMessage);
//            chain.doFilter(request, response);
//        }
//        else if(!validIsBlockChain) {
//            request.setAttribute("errMsg", "IsBlockChain format not valid");
//            RequestDispatcher rd = request.getRequestDispatcher(errorMessage);
//            chain.doFilter(request, response);
//        }
//
//    }
//
//    @Override
//    public void destroy() { }
//
//    @Override
//    public void init(FilterConfig filterConfig) { }
//}
