package com.jsp.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import com.jsp.dto.Employee;

public class EmployeeDao {

	public void createTableEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root",
					"88888888");
			Statement statement = connection.createStatement();
			statement.execute(
					"create table Employee(id int primary key,Name varchar(20),Phone bigint(10),sal double,Email varchar(45),Password varchar(20))");
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

	public Employee saveEmployee(Employee e) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root",
					"88888888");

			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into Employee values(?,?,?,?,?,?);");
			preparedStatement.setInt(1, e.getId());
			preparedStatement.setString(2, e.getName());
			preparedStatement.setLong(3, e.getPhone());
			preparedStatement.setDouble(4, e.getSal());
			preparedStatement.setString(5, e.getEmail());
			preparedStatement.setString(6, e.getPassword());

			preparedStatement.executeUpdate();

			connection.close();

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;

	}

	public int upDateEmployee(Employee e) {

		Properties properties = new Properties();

		try {
			FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
			properties.load(fileInputStream);

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", properties);

			PreparedStatement preparedStatement = connection
					.prepareStatement("update Employee set Name=?,Phone=?,sal=?,Email=?,Password=? where id=?;");

			preparedStatement.setString(1, e.getName());
			preparedStatement.setLong(2, e.getPhone());
			preparedStatement.setDouble(3, e.getSal());
			preparedStatement.setString(4, e.getEmail());
			preparedStatement.setString(5, e.getPassword());
			preparedStatement.setInt(6, e.getId());

			int res = preparedStatement.executeUpdate();

			connection.close();

			return res;

		} catch (ClassNotFoundException | FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return 0;

	}

	public int deleteEmployee(int id) {
		try {
			DriverManager.registerDriver(new Driver() {

				@Override
				public boolean jdbcCompliant() {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public Logger getParentLogger() throws SQLFeatureNotSupportedException {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public int getMinorVersion() {
					// TODO Auto-generated method stub
					return 0;
				}

				@Override
				public int getMajorVersion() {
					// TODO Auto-generated method stub
					return 0;
				}

				@Override
				public Connection connect(String url, Properties info) throws SQLException {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public boolean acceptsURL(String url) throws SQLException {
					// TODO Auto-generated method stub
					return false;
				}
			});

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root",
					"88888888");

			PreparedStatement preparedStatement = connection.prepareStatement("delete from Employee where id=?");
			preparedStatement.setInt(1, id);

			int res1 = preparedStatement.executeUpdate();

			connection.close();

			return (res1);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

	public List<Employee> getAllEmployee() {
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
				long Phone = resultSet.getLong(3);
				double sal = resultSet.getDouble(4);
				String email = resultSet.getString(5);
				String password = resultSet.getString(6);

				Employee employee = new Employee();
				employee.setId(id);
				employee.setName(Name);
				employee.setPhone(Phone);
				employee.setSal(sal);
				employee.setEmail(email);
				employee.setPassword(password);
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

	public Employee getEmployeeById(int id) {

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
				long Phone = resultSet.getLong(3);
				double sal = resultSet.getDouble(4);
				String email = resultSet.getString(5);
				String password = resultSet.getString(6);

				employee.setId(id1);
				employee.setName(Name);
				employee.setPhone(Phone);
				employee.setSal(sal);
				employee.setEmail(email);
				employee.setPassword(password);

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

	public Employee Login(String Email, String Password) {
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
				long Phone = resultSet.getLong(3);
				double sal = resultSet.getDouble(4);
				String email = resultSet.getString(5);
				String password = resultSet.getString(6);

				employee.setId(id1);
				employee.setName(Name);
				employee.setPhone(Phone);
				employee.setSal(sal);
				employee.setEmail(email);
				employee.setPassword(password);

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
