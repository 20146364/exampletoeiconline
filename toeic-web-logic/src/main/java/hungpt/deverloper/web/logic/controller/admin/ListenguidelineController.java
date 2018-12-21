package hungpt.deverloper.web.logic.controller.admin;

import hungpt.deverloper.core.dto.ListenguidelineDTO;
import hungpt.deverloper.core.web.common.WebConstants;
import hungpt.deverloper.web.logic.command.ListenguidelineCommand;

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ListenguidelineCommand command = new ListenguidelineCommand();
        List<ListenguidelineDTO> list = new ArrayList<ListenguidelineDTO>();
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
        command.setTotalItem(list.size());

        request.setAttribute(WebConstants.LIST_ITEMS, command);


        RequestDispatcher dispatcher = request.getRequestDispatcher("views/admin/listenguideline/list.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
    }

}
