import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebFault;

@WebServlet("/GPA")
public class GPAServlet extends HttpServlet{
	sql sql = new sql();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		StudentInfo findhistorystu = sql.findhistorystu(id);
		List<Grade> list = sql.gethistorygrade(findhistorystu.getSno());
		
		req.setAttribute("list", list);
		req.setAttribute("stu", findhistorystu);
		req.getRequestDispatcher("GPAResult.jsp").forward(req, resp);
		return;
	}
}
