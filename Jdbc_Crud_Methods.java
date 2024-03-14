package in.pennant.emp.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.pennant.jdbc.util.JdbcUtilities;

public class Jdbc_Crud_Methods {
	private static final Connection JDBC_CONNECTION = JdbcUtilities.getConnection();
	private static Statement statementobj = null;
	static
	{
		try
		{
			statementobj=JDBC_CONNECTION.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		}
		catch(SQLException e)
		{}
	}
	public static ResultSet getResulSet()
	{
		try {
			return statementobj.executeQuery("select * from emp;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
