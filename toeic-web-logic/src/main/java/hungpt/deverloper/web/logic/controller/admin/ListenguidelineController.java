package hungpt.deverloper.web.logic.controller.admin;

import hungpt.deverloper.core.dto.ListenguidelineDTO;
import hungpt.deverloper.core.service.ListenguidelineService;
import hungpt.deverloper.core.utils.ListentGuidelineBeanUtils;
import hungpt.deverloper.core.web.common.WebConstants;
import hungpt.deverloper.core.web.utils.FormUtils;
import hungpt.deverloper.core.web.utils.RequestUtils;
import hungpt.deverloper.toeic.core.common.constant.CoreConstant;
import hungpt.deverloper.web.logic.command.ListenguidelineCommand;
import hungpt.hust.core.service.impl.ListenguidelineServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(urlPatterns = {"/admin-guideline-listen-list.html", "/admin-guideline-listen-edit.html"})
public class ListenguidelineController extends HttpServlet {
    private ListenguidelineService service = new ListenguidelineServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ListenguidelineCommand command = FormUtils.populate(ListenguidelineCommand.class, request);
//        ResourceBundle bundle = ResourceBundle.getBundle("ApplicationResources");
//        bundle.getString("label.action");

        command.setMaxPageItem(4);
        RequestUtils.initSearchBean(request, command);
        Map<String, Object> property = new HashMap<String, Object>();
        Object[] obj = service.findListenGuideline(property, command.getSortExpression(), command.getSortDirection(), command.getFirstItem(), command.getFirstItem());
        command.setList((List<ListenguidelineDTO>) obj[1]);
        command.setTotalItem(Integer.parseInt(obj[0].toString()));
        request.setAttribute(WebConstants.LIST_ITEMS, command);
        request.setAttribute(WebConstants.LIST_ITEMS, command);


        RequestDispatcher dispatcher;
        if (command.getUrlType().equals(WebConstants.URL_LIST)) {

            dispatcher = request.getRequestDispatcher("views/admin/listenguideline/list.jsp");
        } else {
            dispatcher = request.getRequestDispatcher("views/admin/listenguideline/edit.jsp");
        }


        dispatcher.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
