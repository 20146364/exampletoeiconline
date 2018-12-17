package hungpt.deverloper.web.logic.controller.login;

import hungpt.deverloper.core.dto.UserDTO;
import hungpt.deverloper.core.service.UserService;
import hungpt.deverloper.core.web.common.WebConstants;
import hungpt.deverloper.core.web.utils.FormUtils;
import hungpt.deverloper.web.logic.command.UserCommand;
import hungpt.hust.core.service.impl.UserServiceImpl;
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
            throws ServletException, IOException {

        UserCommand command = FormUtils.populate(UserCommand.class, request);
        UserDTO pojo = command.getPojo();
        UserService service = new UserServiceImpl();
        try {
            UserDTO dto = service.isUserExist(pojo);
            if (dto != null) {
                if (dto.getRoleDTO().getRoleID() == 1) {
                   response.sendRedirect("/admin-home.html");
                } else {
                    response.sendRedirect("/home.html");
                }
            }
        }catch (NullPointerException e){
            logger.trace(e.getMessage(), e);
            request.setAttribute(WebConstants.ALERT, WebConstants.TYPE_ERROR);
            request.setAttribute(WebConstants.MESSAGE_RESPONSE, "Tài khoản hoặc mật khẩu không đúng");
            RequestDispatcher dispatcher = request.getRequestDispatcher("views/login/login.jsp");
            dispatcher.forward(request, response);
        }

    }

}
