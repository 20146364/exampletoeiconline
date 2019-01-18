package hungpt.deverloper.core.web.utils;

import hungpt.deverloper.core.web.command.AbstractCommand;
import org.apache.commons.lang.StringUtils;
import org.displaytag.tags.TableTagParameters;
import org.displaytag.util.ParamEncoder;
import org.testng.log4testng.Logger;

import javax.servlet.http.HttpServletRequest;

public class RequestUtils {
    private static final Logger LOGGER = Logger.getLogger(RequestUtils.class);
    public static void initSearchBean(HttpServletRequest request, AbstractCommand command) {
        String sortExpression = request.getParameter(new ParamEncoder(command.getTableID()).encodeParameterName(TableTagParameters.PARAMETER_SORT));
        String sortDerection = request.getParameter(new ParamEncoder(command.getTableID()).encodeParameterName(TableTagParameters.PARAMETER_ORDER));
        String pageStr = request.getParameter(new ParamEncoder(command.getTableID()).encodeParameterName(TableTagParameters.PARAMETER_PAGE));
        Integer page = 1;
        if (StringUtils.isBlank(pageStr)) {
            try {
                page = Integer.parseInt(pageStr);
            } catch (Exception e) {
                LOGGER.error("error");
                e.printStackTrace();
            }

        }
        command.setPage(page);
        command.setSortDirection(sortDerection);
        command.setSortExpression(sortExpression);
        command.setFirstItem((command.getPage() - 1) * command.getMaxPageItem());
    }

}
