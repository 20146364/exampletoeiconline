package hungpt.deverloper.web.logic.controller.login;

import hungpt.deverloper.core.dto.UserDTO;
import hungpt.deverloper.core.web.utils.FormUtils;
import hungpt.deverloper.web.logic.command.UserCommand;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login.html")
public class LoginController extends HttpServlet {
    private final Logger logger = Logger.getLogger(this.getClass());
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/login/login.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

        UserCommand command = FormUtils.populate(UserCommand.class, request);
        UserDTO pojo = command.getPojo();
        RequestDispatcher dispatcher = request.getRequestDispatcher("views/login/login.jsp");
        dispatcher.forward(request, response);
    }

}
