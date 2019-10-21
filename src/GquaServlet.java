import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 用于控制学生毕业资格审查页面的servlet
 */


@WebServlet("/Gqua")
public class GquaServlet extends HttpServlet{
	sql sql = new sql();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sclass = request.getParameter("sclass");
		int count=0;
		List<StudentInfo> list = sql.findallstu(sclass);
		for (StudentInfo studentInfo : list) {
			studentInfo.setRegsta(sql.getregsta(studentInfo.getSno()));
			
			  if(studentInfo.getRegsta()>12) {
			  studentInfo.setFail("注册表记录大于12"); }
			 
			studentInfo.setGrade(sql.getgrade(studentInfo.getSno()));
			if(!studentInfo.isGrade()) {
				studentInfo.setFail("成绩不合格");
			}
			if(studentInfo.getFail().length()==0) {
				studentInfo.setFail("可以毕业");
				count++;
			}
			//System.out.println(studentInfo);
		
		}
		request.setAttribute("count", count);
		request.setAttribute("list", list);
		request.getRequestDispatcher("GquaResult.jsp").forward(request, response);
		return;
	}
}
