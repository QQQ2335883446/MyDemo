import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dip")
public class DiplomaServlet extends HttpServlet{
	sql sql =new sql();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		StudentInfo findhistorystu = sql.findhistoryid(id);
		req.setAttribute("stu", findhistorystu);
		req.getRequestDispatcher("DipResult.jsp").forward(req, resp);
		return;
	}
}
