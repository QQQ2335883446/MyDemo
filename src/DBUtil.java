
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
/*
 * 数据库工具类
 * 用于连接数据库，提供通用方法
 */

public class DBUtil {
	
		private static String DRIVER=null;
		private static String URL=null;
		private static String USERNAME=null;
		private static String PASSWORD=null;
		
		
		///
		protected Connection cn=null;
		protected PreparedStatement pst=null;
		protected ResultSet rs=null;
		
		/**
		 * 读取配置
		 */
		static{
			InputStream is=DBUtil.class.getClassLoader().getResourceAsStream("db.properties");
			Properties pt=new Properties();
			try {
				pt.load(is); //加载数据库配置信息
			} catch (Exception e) {
				e.printStackTrace();
			}
			DRIVER=pt.getProperty("driver");
			URL=pt.getProperty("url");
			USERNAME=pt.getProperty("username");
			PASSWORD=pt.getProperty("password");
		}
		
		/**
		 * 通用连接
		 */
		public Connection getCn(){
			try {
				Class.forName(DRIVER);
				return DriverManager.getConnection(URL,USERNAME,PASSWORD);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
			
		}
		
		/**
		 * 通用关闭
		 */
		public void close(Connection cn,PreparedStatement pst,ResultSet rs){
			try {
				if(rs!=null) {rs.close();}
				if(pst!=null) {pst.close();}
				if(cn!=null) {cn.close();}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * 通用增删改方法
		 */
		public int executeUpdate(String sql,Object[] obj){
			try {
				cn=getCn();
				pst=cn.prepareStatement(sql);
				if (obj!=null) {
					for (int i = 0; i < obj.length; i++) {
						pst.setObject(i+1,obj[i]);
					}
				}
				return pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				close(cn, pst, rs);
			}
		  return 0;
		}
		
		/**
		 * 通用查询方法
		 */
		public ResultSet select(String sql,Object[] obj){
			try {
				cn=getCn();
				pst=cn.prepareStatement(sql);
				for (int i = 0; i < obj.length; i++) {
					  pst.setObject(i+1,obj[i]);
				}
				return pst.executeQuery();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

}

