package com.jsp.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.jsp.dto.Employee;
import com.mysql.cj.jdbc.Driver;

public class EmployeeDao {

	public void createTable() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root",
					"88888888");
			Statement statement = connection.createStatement();
			statement.execute(
					"create table Employee(id int primary key,Name varchar(20),Age int(2),sal double,Email varchar(45),Password varchar(20),Phone bigint(10))");
			connection.close();
			System.out.println("table created");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block4a
			e.printStackTrace();
		}
	}

	public Employee save(Employee employee) {

		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root",
					"88888888");

			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into Employee values(?,?,?,?,?,?,?);");
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setInt(3, employee.getAge());
			preparedStatement.setDouble(4, employee.getSal());
			preparedStatement.setString(5, employee.getEmail());
			preparedStatement.setString(6, employee.getPassword());
			preparedStatement.setLong(7, employee.getPhoneNo());

			preparedStatement.executeUpdate();

			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;

	}

	public int update(Employee employee) {

		Properties properties = new Properties();

		try {
			FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
			properties.load(fileInputStream);

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", properties);

			PreparedStatement preparedStatement = connection
					.prepareStatement("update Employee set Name=?,Age=?,sal=?,Email=?,Password=?,Phone=? where id=?;");

			preparedStatement.setString(1, employee.getName());
			preparedStatement.setLong(2, employee.getAge());
			preparedStatement.setDouble(3, employee.getSal());
			preparedStatement.setString(4, employee.getEmail());
			preparedStatement.setString(5, employee.getPassword());
			preparedStatement.setLong(6, employee.getPhoneNo());
			preparedStatement.setInt(7, employee.getId());

			int res = preparedStatement.executeUpdate();

			connection.close();

			return res;

		} catch (ClassNotFoundException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	public int delete(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=88888888");

			PreparedStatement preparedStatement = connection.prepareStatement("delete from Employee where id=?");
			preparedStatement.setInt(1, id);

			int res = preparedStatement.executeUpdate();

			connection.close();

			return res;

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}
		return 0;
	}

	public List<Employee> display() {
		List<Employee> list = new ArrayList<Employee>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root",
					"88888888");

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from Employee");

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String Name = resultSet.getString(2);
				int age = resultSet.getInt(3);
				double sal = resultSet.getDouble(4);
				String email = resultSet.getString(5);
				String password = resultSet.getString(6);
				long phoneNo = resultSet.getLong(7);

				Employee employee = new Employee();
				employee.setId(id);
				employee.setName(Name);
				employee.setAge(age);
				employee.setSal(sal);
				employee.setEmail(email);
				employee.setPassword(password);
				employee.setPhoneNo(phoneNo);
				list.add(employee);

			}

			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	public Employee find(int id) {
		Employee employee = new Employee();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root",
					"88888888");

			PreparedStatement preparedStatement = connection.prepareStatement("select * from Employee where id=?");
			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String Name = resultSet.getString(2);
				int age = resultSet.getInt(3);
				double sal = resultSet.getDouble(4);
				String email = resultSet.getString(5);
				String password = resultSet.getString(6);
				long phoneNo = resultSet.getLong(7);

				employee.setId(id1);
				employee.setName(Name);
				employee.setAge(age);
				employee.setSal(sal);
				employee.setEmail(email);
				employee.setPassword(password);
				employee.setPhoneNo(phoneNo);

			}

			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (employee.getId() > 0) {
			return employee;
		}
		return null;
	}

	public Employee login(String Email, String Password) {
		Employee employee = new Employee();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root",
					"88888888");

			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from Employee where Email=? and Password=?");
			preparedStatement.setString(1, Email);
			preparedStatement.setString(2, Password);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String Name = resultSet.getString(2);
				int age = resultSet.getInt(3);
				double sal = resultSet.getDouble(4);
				String email = resultSet.getString(5);
				String password = resultSet.getString(6);
				long phoneNo = resultSet.getLong(7);

				employee.setId(id1);
				employee.setName(Name);
				employee.setAge(age);
				employee.setSal(sal);
				employee.setEmail(email);
				employee.setPassword(password);
				employee.setPhoneNo(phoneNo);
			}
			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (employee.getId() > 0) {
			return employee;
		}
		return null;
	}

}
