import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * 数据库查找操作
 */

public class sql {
	DBUtil dbTools = new DBUtil();
	//根据班级 查询所有学生
	public List<StudentInfo> findallstu(String s){
		Connection conn = null;
		ResultSet rs = null;
		ArrayList<StudentInfo> stus = new ArrayList<StudentInfo>();
		//System.out.println(s);
		try {
			conn = dbTools.getCn();
			String sql = "SELECT * FROM 1_student_basic sb INNER JOIN 1_student_information si ON si.Sno = sb.Sno WHERE si.Sclass=?";
			rs = dbTools.select(sql, new Object[] {s});
			//System.out.println("jinru");
			while(rs.next()){
				StudentInfo stu = new StudentInfo(rs.getNString("sno"),rs.getNString("sname"),
												  rs.getNString("snative"),
												  rs.getString("ssex"),
												  rs.getString("stel"),
												  rs.getString("saddress"),0,true);
				stus.add(stu);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return stus;
	}
	//获取学生注册次数
	public int getregsta(String sno) {
		Connection conn = null;
		ResultSet rs = null;
		try {
			conn = dbTools.getCn();
			String sql = "SELECT SUM(Reg_sta) FROM 1_register WHERE Sno=?";
			rs = dbTools.select(sql, new Object[] {sno});
			while(rs.next())
			return rs.getInt(1);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
		
	}
	//判断是否挂科
	public boolean getgrade(String sno) {
		Connection conn = null;
		ResultSet rs = null;
		try {
			conn = dbTools.getCn();
			String sql = "select * from 4_grade WHERE Sno=?";
			rs = dbTools.select(sql, new Object[] {sno});
			while(rs.next()) {
				if(rs.getInt("score")<60) {
					return false;
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return true;
		
	}
	
	public StudentInfo findhistorystu(String id){
		Connection conn = null;
		ResultSet rs = null;
		ArrayList<StudentInfo> stus = new ArrayList<StudentInfo>();
		//System.out.println(s);
		try {
			conn = dbTools.getCn();
			String sql = "SELECT * from 1_history where Id=?";
			rs = dbTools.select(sql, new Object[] {id});
			//System.out.println("jinru");
			while(rs.next()){
				StudentInfo stu = new StudentInfo(rs.getNString("sno"),rs.getNString("sname"),
												  rs.getNString("snative"),
												  rs.getString("ssex"),
												  rs.getString("stel"),
												  rs.getString("conclusion"));
				return stu;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public List<Grade> gethistorygrade(String sno){
		Connection conn = null;
		ResultSet rs = null;
		ArrayList<Grade> grade = new ArrayList<Grade>();
		System.out.println(sno);
		//System.out.println(s);
		try {
			conn = dbTools.getCn();
			String sql = "SELECT cname,score,credit FROM 2_curseinfo c INNER JOIN 4_grade g ON g.Cnumber = c.Cnumber AND g.Sno=?";
			rs = dbTools.select(sql, new Object[] {sno});
			//System.out.println("jinru");
			while(rs.next()){
				Grade g = new Grade(rs.getNString("cname"),rs.getInt("score"),rs.getInt("credit"));
				grade.add(g);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return grade;
	}
	public StudentInfo findhistoryid(String id){
		Connection conn = null;
		ResultSet rs = null;
		ArrayList<StudentInfo> stus = new ArrayList<StudentInfo>();
		//System.out.println(s);
		try {
			conn = dbTools.getCn();
			String sql = "SELECT * from 1_history where Id=?";
			rs = dbTools.select(sql, new Object[] {id});
			//System.out.println("jinru");
			while(rs.next()){
				StudentInfo stu = new StudentInfo(rs.getNString("sno"),rs.getNString("sname"),rs.getNString("graduid"),
												  rs.getNString("degreeid"));
				return stu;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public StudentInfo findhistory(String id){
		Connection conn = null;
		ResultSet rs = null;
		ArrayList<StudentInfo> stus = new ArrayList<StudentInfo>();
		//System.out.println(s);
		try {
			conn = dbTools.getCn();
			String sql = "SELECT * from 1_history h INNER JOIN 1_department d on h.Dno=d.Dno and h.Sno=?";
			rs = dbTools.select(sql, new Object[] {id});
			//System.out.println("jinru");
			while(rs.next()){
				StudentInfo stu = new StudentInfo(rs.getNString("sname"),rs.getNString("graduid"),
												  rs.getNString("degreeid"),rs.getNString("id"),rs.getString("dname"));
				return stu;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
public static void main(String[] args) {
	sql sql = new sql();
	StudentInfo findhistorystu = sql.findhistory("110");
	System.out.println(sql.findhistory("110"));


}
}
