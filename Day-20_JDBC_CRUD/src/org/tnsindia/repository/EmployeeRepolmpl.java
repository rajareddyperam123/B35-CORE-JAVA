package org.tnsindia.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.crypto.Data;

import org.tnsindia.dao.EmployeeDAO;
import org.tnsindia.entities.Employee;

import com.mysql.cj.xdevapi.Statement;

@SuppressWarnings("unused")
public class EmployeeRepolmpl<dao> implements EmployeeRepo{

	
	EmployeeDAO dao;
	
	
	public EmployeeRepolmpl() {
		dao=new EmployeeDAO();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Statement createStatement() {
		Connection c=dao.createConnection();
		Statement s;
		
		try {
			s=(Statement) c.createStatement();
		} catch (SQLException e) {
			s=null;
			System.out.println("Something went wrong");
		}
		return s;
	}

	@Override
	public PreparedStatement createPrepareStatement(String query) {
		Connection c=dao.createConnection();
		PreparedStatement s;
		
		try {
			s=c.prepareStatement(query);
		} catch (SQLException e) {
			s=null;
			System.out.println("Something went wrong");
		}
		return s;
	}

	@Override
	public ResultSet retreive(String query) {
		
		@SuppressWarnings("rawtypes")
		Statement s=createStatement();
		ResultSet rs;
		try {
			rs=((java.sql.Statement) s).executeQuery(query);
		} catch (SQLException e) {
			rs=null;
			System.out.println("Something went wrong");
		}
		return rs;
	}

	@Override
	public int add(String query, Employee emp) {
		PreparedStatement s=createPrepareStatement(query);
		int count=0;
		try {
			s.setInt(1, emp.getID());
			s.setString(2,emp.getNAME());
			count=s.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Data not found");
		}
		return count;
	}

	@Override
	public int update(String query, Employee emp) {
		PreparedStatement s=createPrepareStatement(query);
		int count=0;
		try {
			s.setInt(2, emp.getID());
			s.setString(1,emp.getNAME());
			count=s.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Data not found");
		}
		return count;
	}

	@Override
	public int delete(String query) {
		@SuppressWarnings("rawtypes")
		Statement s=createStatement();
		int count=0;
		
		try {
			count=((java.sql.Statement) s).executeUpdate(query);
		} catch (SQLException e) {
			count=0;
			System.out.println("Data Not found");
		}
		return count;
	}

}
