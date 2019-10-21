import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/GetDip")
public class GetDipServlet extends HttpServlet{
	sql sql = new sql();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		System.out.println(id);
		StudentInfo findhistorystu = sql.findhistory(id);
		System.out.println(findhistorystu);
		req.setAttribute("stu", findhistorystu);
		req.getRequestDispatcher("GetDip.jsp").forward(req, resp);
		return;
	}
}
