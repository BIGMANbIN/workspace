package kaishengit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
//	��ѯһ������
//	public static void main(String[] args) throws SQLException {
//		String driver = "com.mysql.jdbc.Driver";
//		try {
//			Class.forName(driver);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		String url = "jdbc:mysql://127.0.0.1:3306/zbd?user=root&password=920926";
//		Connection conn = DriverManager.getConnection(url);
//		Statement stat = conn.createStatement();
//		String sql = "SELECT `name`,`id` as `���` FROM `admin`";
//		ResultSet rs = stat.executeQuery(sql);
//		while (rs.next()) {System.err.println(rs.getString("���") +" " + rs.getString("name"));
//		}
//	}
//}

  
//	��������	
//	public static void main(String[] args) throws Exception {
//		
//		String driver = "com.mysql.jdbc.Driver";
//		Class.forName(driver);
////		
////		
////	{	String url = "jdbc:mysql://127.0.0.1:3306/zbd";
//////		127.0.0.1:3306���Բ�д
////		String name = "root";
////		String pwd = "920926";
////		Connection conn = DriverManager.getConnection(url,name,pwd); } ��ʡ��
////		
////		
//		String url = "jdbc:mysql://127.0.0.1:3306/zbd?user=root&password=920926";
//		Connection conn = DriverManager.getConnection(url);
//		Statement stat = conn.createStatement();
//		String sql = "INSERT INTO `admin`(`name`,`pwd`) VALUES('tom','123')";
////		String sql = "delete from `admin`where `name` = 'Tom'";
//		int result = stat.executeUpdate(sql);
//		if(result == 1){
//			System.out.println("����ɹ�");
//		}else {
//			System.out.println("ʧ��");
//		}
//		
//	}
//}
	
//    �ر�
		
//	public static void main(String[] args) {
//		
//		Connection conn = null;
//		Statement stat = null;
//		ResultSet rs = null;
//		String url = "jdbc:mysql://127.0.0.1:3306/zbd?user=root&password=920926";
//		try {
//			conn = DriverManager.getConnection(url);
//			stat = conn.createStatement();
//			String sql = "SELECT `name`,`id` as `���` FROM `admin`";
//			rs = stat.executeQuery(sql);
//			while (rs.next()) {
//				System.err.println(rs.getString("���") +" " + rs.getString("name"));
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally{
//			Helper.closeConnection(conn, stat, rs);
//		}
//	}
//}	

	
//	ע�� ��½
	public static void main(String[] args){
		String url = "jdbc:mysql://127.0.0.1:3306/zbd?user=root&password=920926";
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		try {
			conn = DriverManager.getConnection(url);
			stat = conn.createStatement();
		
			System.out.println("�û�����");
			String name = sc.next();
			System.out.println("���룺");
			String pwd = sc.next();
			String sql = "select * from `admin` where `name` = '"+name+"'and pwd = '"+pwd+"'";

//			String sql = "insert into `admin`(`name`,`pwd`) values('"+ name +"','"+ pwd +"')";
//			System.out.println(sql);
//			int result  = stat.executeUpdate(sql);
			rs = stat.executeQuery(sql);
			if(rs.next()){
			
//			if(result == 1){
//				System.out.println("ע��ɹ�");
				System.out.println("��½�ɹ�");
			} else {
//				System.out.println("ע��ʧ��");
				System.out.println("��¼ʧ��");
			}
			} catch (SQLException e) {
				
		}finally{
			Helper.closeConnection(conn, stat, rs);
		}
	} 
	
	


		
}	
	
		
		
		
		
		
		
		
		


		

