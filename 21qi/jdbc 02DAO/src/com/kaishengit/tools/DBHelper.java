package com.kaishengit.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DBHelper<T> {
	private String url;
	private Connection conn = null;
	private PreparedStatement stat = null;
	private ResultSet rs = null;
	
	public DBHelper (String url){
		this.url = url;
	}
	
	public int doUpdate(String sql, Object... paras){
		getStatement(sql);
		
		try {
			for(int i = 0; i < paras.length; i++){
				stat.setObject(i +1, paras[i]);
			}
			return stat.executeUpdate();
		} catch (SQLException e) {
		System.out.println("doUpdate error");
		return -1;
		}
		finally{
			closeConnection();
		}
	}
	
	
	public T queryOne(String sql,BuildEnetity<T> be, Object... paras){
		getStatement(sql);
		
		try {
			for(int i = 0; i < paras.length; i++){
				stat.setObject(i + 1, paras[i]);
			}
			rs = stat.executeQuery();
			if (rs.next()){
			return be.build(rs);
			}else{
				return null;
			}
			
		} catch (SQLException e) {
			System.out.println("doQueryOne error");
			e.printStackTrace();
			return null;
			
		}finally{
			closeConnection();
		}
		
	}
	
	public List<T> queryList(String sql,BuildEnetity<T> be, Object... paras){
		getStatement(sql);
		
		try {
			for(int i = 0; i < paras.length; i++){
				stat.setObject(i + 1, paras[i]);
			}
			rs = stat.executeQuery();
			
			List<T> list = new ArrayList<>();
			while (rs != null && rs.next()){
				
				list.add(be.build(rs));
			}
			
			
			return list;
			
		} catch (SQLException e) {
			System.out.println("doQuery error");
			return null;
		}finally{
			closeConnection();
		}
		
	}
	
	
	private void getStatement(String sql){
		try {
			conn = DriverManager.getConnection(url);
			stat = conn.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println("getStatement error");
		}
		
	}
	
	
//	封装连接关闭
	public  void closeConnection(){
		try {
			if(rs != null){
				
				rs.close();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			
			try {
				if(stat != null){
					
					stat.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally{
				
				try {
					if(conn != null){
						
					conn.close();
					}
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}
