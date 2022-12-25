package org.tnsindia.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.tnsindia.entities.Employee;

import com.mysql.cj.xdevapi.Statement;

public interface EmployeeRepo {

	//to execute a query use Statement
	@SuppressWarnings("rawtypes")
	Statement createStatement();
	PreparedStatement createPrepareStatement(String query);
	public ResultSet retreive(String query);
	public int add(String query, Employee emp);
	public int update(String query, Employee emp);
	public int delete(String query);


}

