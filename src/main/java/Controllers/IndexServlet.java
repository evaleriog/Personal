package Controllers;
import dao.DaoFactory;
import Model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name="Controllers.IndexServlet", urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        try {
            req.setAttribute("userInput", req.getParameter("userInput"));
            req.setAttribute("passInput", req.getParameter("passInput"));
            Songs allSongs = DaoFactory.getSongsDao();
            List<Song> songs = allSongs.all();
            req.setAttribute("songs", songs);
            req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, res);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
