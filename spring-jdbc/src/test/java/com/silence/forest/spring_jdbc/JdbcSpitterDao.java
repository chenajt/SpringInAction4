package com.silence.forest.spring_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

public class JdbcSpitterDao implements ISpitterDao{
	private DataSource dataSource;
	
	private static final String SQL_INSERT_SPITTER = "insert into spitter (userName,password,fullName,email) values (?,?,?,?)";
	private static final String SQL_SELECT_SPITTER = "select id,userName,password,fullName,email from spitter where id=?";

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void addSpitter(Spitter spitter) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareStatement(SQL_INSERT_SPITTER);
			stmt.setString(1,spitter.getUserName());
			stmt.setString(2,spitter.getPassword());
			stmt.setString(3,spitter.getFullName());
			stmt.setString(4,spitter.getEmail());
			stmt.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				if(stmt!=null){
					stmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			}catch(SQLException e){
				
			}
		}
	}

	public void saveSpitter(Spitter spitter) {
		// TODO Auto-generated method stub
	}

	public Spitter getSpitterById(long id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT_SPITTER);
			stmt.setLong(1, id);
			rs = stmt.executeQuery();
			System.out.println(rs);
			Spitter spitter = null;
			if(rs.next()){
				spitter = new Spitter();
				spitter.setId(rs.getLong("id"));
				spitter.setUserName(rs.getString("userName"));
				spitter.setPassword(rs.getString("password"));
				spitter.setFullName(rs.getString("fullName"));
			}
			return spitter;
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				if(rs!=null){
					rs.close();
				}
				if(stmt!=null){
					stmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			}catch(SQLException e){
				
			}
		}
		return null;
	}

	public List<Spittle> getRecentSpittle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveSpittle(Spittle spittle) {
		// TODO Auto-generated method stub
		
	}

	public List<Spittle> getSpittlesForSpitter(Spitter spitter) {
		// TODO Auto-generated method stub
		return null;
	}

	public Spitter getSpitterByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteSpittle(long id) {
		// TODO Auto-generated method stub
		
	}

	public Spittle getSpittleById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Spitter> findAllSpitters() {
		// TODO Auto-generated method stub
		return null;
	}

}
