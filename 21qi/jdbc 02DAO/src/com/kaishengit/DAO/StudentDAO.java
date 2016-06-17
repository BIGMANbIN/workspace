package com.kaishengit.DAO;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.kaishengit.entity.Student;
import com.kaishengit.tools.BuildEnetity;
import com.kaishengit.tools.Conf;
import com.kaishengit.tools.DBHelper;

public class StudentDAO {
	DBHelper<Student> db = new DBHelper<Student>(Conf.DB_URL);
//	删除、
	public int removeBystudentNo(String studentno){
		String sql = "select from student where studentno=?";
		return db.doUpdate(sql, studentno);
	}
	
//	新增
	
	public int addStudent(Student stu){
		String sql = "insert into student(studentno,name,id_card,sex,phone,address,email,majorid) values(?,?,?,?,?,?,?,?)";
		return db.doUpdate(sql,stu.getStudentno(),stu.getName(),stu.getId_card(),
				stu.getSex(),stu.getPhone(),stu.getAddress(),stu.getEmail(),stu.getMajorid());
		}
	
//	修改
	
	public int modifyByStudentNo(Student stu){
		String sql = "update student set name=?,id_card=?,sex=?,phone=?,address=?,email=?,majorid=? where studentno=?";
		return db.doUpdate(sql,stu.getName(),stu.getId_card(),
				stu.getSex(),stu.getPhone(),stu.getAddress(),stu.getEmail(),stu.getMajorid(),stu.getStudentno());
	}
	
//	查询
	public Student queryByStudentNo(String studentno){
		String sql = "select studentno,name,id_card,sex,phone,address,email,majorid from student where studentno=?";
//		ResultSet rs = db.doQuery(sql, studentno);
//		try {
//			if(rs != null && rs.next()){
//				
////				Student stu = new Student();
////				stu.setStudentno(rs.getString("studentno"));
////				stu.setName(rs.getString("name"));
////				stu.setId_card(rs.getString("id_card"));
////				stu.setSex(rs.getBoolean("sex"));
////				stu.setPhone(rs.getString("phone"));
////				stu.setAddress(rs.getString("address"));
////				stu.setEmail(rs.getString("email"));
////				stu.setMajorid(rs.getInt("majorid"));
////				return stu;
//			    return buildEnetity(rs);                        
//			}else {
//				return null;
//			}
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//			return null;
//		}finally {
//			db.closeConnection();
//		}
		
		return db.queryOne(sql, new MyBuild(), studentno);
		
	}
	
	public List<Student> queryAll(){
		String sql = "select studentno,name,id_card,sex,phone,address,email,majorid from student";
		return db.queryList(sql, new MyBuild());
	
	}
	
//	private Student buildEnetity(ResultSet rs) throws SQLException{
//		Student stu = new Student();
//		stu.setStudentno(rs.getString("studentno"));
//		stu.setName(rs.getString("name"));
//		stu.setId_card(rs.getString("id_card"));
//		stu.setSex(rs.getBoolean("sex"));
//		stu.setPhone(rs.getString("phone"));
//		stu.setAddress(rs.getString("address"));
//		stu.setEmail(rs.getString("email"));
//		stu.setMajorid(rs.getInt("majorid"));
//		
//		return stu;
//	}
	class MyBuild implements BuildEnetity<Student>{
		
		@Override
		public Student build(ResultSet rs) throws SQLException {
			
			Student stu = new Student();
			
			Class<Student> type = Student.class;
			
		java.sql.ResultSetMetaData rsmd = rs.getMetaData();
			
//			System.out.println(rsmd.getColumnCount());
//			System.out.println(rsmd.getColumnLabel(1));
			
			Method[] mds = type.getMethods();
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			
			String colName = rsmd.getColumnLabel(i);
			colName = colName.substring(0, 1).toUpperCase() + colName.substring(1);
			colName = "set" + colName; 		
			System.out.println(colName);
			System.out.println(rsmd.getColumnLabel(i)+":" + rs.getObject(i));
			for(Method md : mds) {
				if(md.getName().equals(colName)){
					try {
						md.invoke(stu,rs.getObject(i));
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} break;
			}
			
			
		}
		
	//			stu.setStudentno(rs.getString("studentno"));
	//			stu.setName(rs.getString("name"));
	//			stu.setId_card(rs.getString("id_card"));
	//			stu.setSex(rs.getBoolean("sex"));
	//			stu.setPhone(rs.getString("phone"));
	//			stu.setAddress(rs.getString("address"));
	//			stu.setEmail(rs.getString("email"));
	//			stu.setMajorid(rs.getInt("majorid"));
			
			return stu;
		}
		
		
	}
}
