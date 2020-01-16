package Controllers;

import Model.User;
import Model.Users;
import dao.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LogInServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean isCorrect = username.equals("admin") && password.equals("password");

        if(username != null && password != null){
            Users users = DaoFactory.getUsersDao();
            User correctUser = users.findUsername(username);

            if(correctUser != null){
                if(correctUser.getPassword().equals(password)){
                    HttpSession logIn = request.getSession();
                    logIn.setAttribute("isLogged", true);
                    logIn.setAttribute("user", correctUser);
                    request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
                }else {
                    request.setAttribute("userInput", username);
                    request.setAttribute("incorrect", "Username & Password Combination Does Not Match");
                    request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
                }

            }else {
                if(!username.equals("")){
                    request.setAttribute("userInput", username);
                }
                if(!password.equals("")){
                    request.setAttribute("passInput", password);
                }
                request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
            }
        }else {
            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        }
    }
}
