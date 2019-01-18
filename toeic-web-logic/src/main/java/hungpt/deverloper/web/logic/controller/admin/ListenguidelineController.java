package hungpt.deverloper.web.logic.controller.admin;

import hungpt.deverloper.core.dto.ListenguidelineDTO;
import hungpt.deverloper.core.service.ListenguidelineService;
import hungpt.deverloper.core.utils.ListentGuidelineBeanUtils;
import hungpt.deverloper.core.web.common.WebConstants;
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
import java.util.ArrayList;
import java.util.List;

@WebServlet("/admin-guideline-listen-list.html")
public class ListenguidelineController extends HttpServlet {
    private ListenguidelineService service = new ListenguidelineServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ListenguidelineCommand command = new ListenguidelineCommand();
       /* List<ListenguidelineDTO> list = new ArrayList<ListenguidelineDTO>();
        ListenguidelineDTO dto = new ListenguidelineDTO();

        dto.setTitleName("Bài hướng dẫn số 1");
        dto.setContent("Nộ dung bài hướng dẫn số 1");
        list.add(dto);

        ListenguidelineDTO dto1 = new ListenguidelineDTO();
        dto1.setTitleName("Bài hướng dẫn số 2");
        dto1.setContent("Nộ dung bài hướng dẫn số 2");
        list.add(dto1);


        ListenguidelineDTO dto2 = new ListenguidelineDTO();
        dto2.setTitleName("Bài hướng dẫn số 3");
        dto2.setContent("Nộ dung bài hướng dẫn số 3");
        list.add(dto2);

        ListenguidelineDTO dto3 = new ListenguidelineDTO();
        dto3.setTitleName("Bài hướng dẫn số 4");
        dto3.setContent("Nộ dung bài hướng dẫn số 4");
        list.add(dto3);

        command.setList(list);
        command.setMaxPageItem(2);
        command.setTotalItem(list.size()); */
        command.setMaxPageItem(2);
        RequestUtils.initSearchBean(request, command);
        Object[] obj = service.findListenGuideline(null, null, command.getSortExpression(), command.getSortDirection(), command.getFirstItem(), command.getFirstItem());
        command.setList((List<ListenguidelineDTO>)obj[1]);
        command.setTotalItem(Integer.parseInt(obj[0].toString()));
        request.setAttribute(WebConstants.LIST_ITEMS, command);
        request.setAttribute(WebConstants.LIST_ITEMS, command);


        RequestDispatcher dispatcher = request.getRequestDispatcher("views/admin/listenguideline/list.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
