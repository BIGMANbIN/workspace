package com.kaishengit;

import com.kaishengit.DAO.StudentDAO;
import com.kaishengit.entity.Student;



public class Test {
//	public static void main(String[] args){
//		String url = "jdbc:mysql://127.0.0.1:3306/zbd?user=root&password=920926";
//		Connection conn = null;
//		PreparedStatement stat = null;
//		ResultSet rs = null;
//		Scanner sc = new Scanner(System.in);
//		try {
//			conn = DriverManager.getConnection(url);
//			String sql = "insert into admin (`name`,`pwd`) values(?,?)";
//			stat = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//			
//			System.out.println("�û�����");
//			String name = sc.next();
//			System.out.println("���룺");
//			String pwd = sc.next();
//			
//			System.out.println(sql);
//			stat.setString(1, name); 
//			stat.setString(2, pwd); 
//			
//			int r = stat.executeUpdate();
//			
//			rs = stat.getGeneratedKeys();
//			if(rs.next()){
//				System.out.println(rs.getString(1));
//				System.out.println("�ɹ�");
//			} else {
//				System.out.println("ʧ��");
//			}
//			} catch (SQLException e) {
//		}finally{
//			Helper.closeConnection(conn, stat, rs);
//		}
//	} 
//}


//	public static void main(String[] args) throws SQLException{
//		String url = "jdbc:mysql://127.0.0.1:3306/zbd?user=root&password=920926";
//		
//		DBHelper db = new DBHelper(url);
//		
//		Scanner sc = new Scanner(System.in);
////		String sql = "select * from admin";
////		���     String sql = "insert into admin (`name`,`pwd`) values(?,?)";
////		String sql = "delete from admin where name=? and pwd=?";
////		System.out.println("�û�����");
////		String name = sc.next();
////		System.out.println("���룺");
////		String pwd = sc.next();
////		int r = db.doUpdate(sql, name, pwd);
////		if(r == 1){
////			System.out.println("�ɹ�");
////		}else{
////			System.out.println("ʧ��");
////		}
////		
////		��ѯ��������
////		ResultSet rs = db.doQuery(sql);
////		while (rs.next()) {
////			System.out.println(rs.getString("name"));
////	}
////		db.closeConnection();
//		
////		��½
//		
//		String sql = "select 1 from admin where name=? and pwd=?";
//		System.out.println("�û�����");
//		String name = sc.next();
//		System.out.println("���룺");
//		String pwd = sc.next();
//		
//		ResultSet rs = db.doQuery(sql, name, pwd);
//		
//		if (rs.next()) {
//			System.out.println("�ɹ�");
//		}else{
//			System.out.println("ʧ��");
//		}
//			
//		db.closeConnection();
//		sc.close();
//	}
//	public static void main(String[] args) throws SQLException{
//		StudentDAO dao = new StudentDAO();
		
//		Student stu = new Student();
//		stu.setStudentno("111111111");
//		stu.setName("Tom");
//		stu.setId_card("557885258963214560");
//		stu.setSex(true);
//		stu.setMajorid(6);
//		
//		int res = dao.addStudent(stu);
//		if (res == 1){
//			System.out.println("�ɹ�");
//		}else {
//			System.out.println("ʧ��");
//		}

//		��ѯһ��
//		 Student stu = dao.queryByStudentNo("200801056");
//			 System.out.println(stu);
		
//		��ѯȫ��
//		
//		List<Student> list = dao.queryAll();
//		System.out.println(list.size());
//		for (Student student : list) {
//			System.out.println(student);
//			
//		}
//		
//	}
	
//	public static void main(String[] args) throws Exception{
//		
////		Student stu = creatEntity(Student.class);
//		
//		Class<?> type = Class.forName("com.kaishengit.entity.Student");
//		Object obj = creatEntity(type);
//		Method md = type.getMethod("setStudentno", String.class);
//		md.invoke(obj, "123135465");
//		
//		Method md1 = type.getMethod("getStudentno");
//		System.out.println(md1.invoke(obj));
//		
//	}
//	
//	static<T> T creatEntity(Class<T> type){
//		T t = null;
//		
//		try {
//			
//			return type.newInstance();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return t;
//	}
	
	public static void main(String[] args) throws Exception{
		StudentDAO sd = new StudentDAO();
		Student stu = sd.queryByStudentNo("200801058");
		
		System.out.println(stu);
	
	}
}
		