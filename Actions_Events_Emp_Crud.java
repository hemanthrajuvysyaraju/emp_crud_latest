package in.pennant.emp.crud;

import java.sql.Date;
import java.sql.SQLException;

public class Actions_Events_Emp_Crud {
//	private static final Emp_Interface_Ui MANAGER = new Emp_Interface_Ui();
	protected static void first_Action()
	{
		setFeildsNonTouchable();
		try {
			Emp_Interface_Ui.result_set_scrollable.first();
			Emp_Interface_Ui.empnofld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getInt("empno")));
			Emp_Interface_Ui.namefld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getString("ename")));
			Emp_Interface_Ui.jobfld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getString("job")));
			Emp_Interface_Ui.salfld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getDouble("sal")));
			Emp_Interface_Ui.deptnochc.select(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getInt("deptno")));
			Emp_Interface_Ui.hiredatefld.setDate(Emp_Interface_Ui.result_set_scrollable.getDate("hiredate"));	
			check_ResultSet_Status();
		} catch (SQLException e) {}
	}
	protected static void next_Action()
	{
		setFeildsNonTouchable();
		try {
			Emp_Interface_Ui.result_set_scrollable.next();
			Emp_Interface_Ui.empnofld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getInt("empno")));
			Emp_Interface_Ui.namefld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getString("ename")));
			Emp_Interface_Ui.jobfld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getString("job")));
			Emp_Interface_Ui.salfld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getDouble("sal")));
			Emp_Interface_Ui.deptnochc.select(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getInt("deptno")));
			Emp_Interface_Ui.hiredatefld.setDate(Emp_Interface_Ui.result_set_scrollable.getDate("hiredate"));	
			check_ResultSet_Status();
		} catch (SQLException e) {}
		
		
	}
	protected static void prev_Action()
	{
		setFeildsNonTouchable();
		try {
			Emp_Interface_Ui.result_set_scrollable.previous();
			Emp_Interface_Ui.empnofld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getInt("empno")));
			Emp_Interface_Ui.namefld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getString("ename")));
			Emp_Interface_Ui.jobfld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getString("job")));
			Emp_Interface_Ui.salfld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getDouble("sal")));
			Emp_Interface_Ui.deptnochc.select(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getInt("deptno")));
			Emp_Interface_Ui.hiredatefld.setDate(Emp_Interface_Ui.result_set_scrollable.getDate("hiredate"));	
			check_ResultSet_Status();
		} catch (SQLException e) {}
	}
	protected static void last_Action()
	{
		setFeildsNonTouchable();
		try {
			Emp_Interface_Ui.result_set_scrollable.last();
			Emp_Interface_Ui.empnofld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getInt("empno")));
			Emp_Interface_Ui.namefld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getString("ename")));
			Emp_Interface_Ui.jobfld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getString("job")));
			Emp_Interface_Ui.salfld.setText(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getDouble("sal")));
			Emp_Interface_Ui.deptnochc.select(String.valueOf(Emp_Interface_Ui.result_set_scrollable.getInt("deptno")));
			Emp_Interface_Ui.hiredatefld.setDate(Emp_Interface_Ui.result_set_scrollable.getDate("hiredate"));	
			check_ResultSet_Status();
		} catch (SQLException e) {}
	}
	protected static void clear_Action()
	{
		Emp_Interface_Ui.addbtn.setEnabled(true);
		Emp_Interface_Ui.empnofld.setEnabled(true);
		Emp_Interface_Ui.empnofld.setText(null);
		Emp_Interface_Ui.namefld.setEnabled(true);
		Emp_Interface_Ui.namefld.setText(null);
		Emp_Interface_Ui.jobfld.setEnabled(true);
		Emp_Interface_Ui.jobfld.setText(null);
		Emp_Interface_Ui.salfld.setEnabled(true);
		Emp_Interface_Ui.salfld.setText(null);
		Emp_Interface_Ui.deptnochc.setEnabled(true);
		Emp_Interface_Ui.hiredatefld.setEnabled(true);
		try {
			check_ResultSet_Status();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void edit_Action()
	{
		
		Emp_Interface_Ui.namefld.setEnabled(true);
		Emp_Interface_Ui.jobfld.setEnabled(true);
		Emp_Interface_Ui.salfld.setEnabled(true);
		Emp_Interface_Ui.deptnochc.setEnabled(true);
		Emp_Interface_Ui.hiredatefld.setEnabled(true);
	}
	public static void delete_Action()
	{
		try {
			Emp_Interface_Ui.result_set_scrollable.deleteRow();
			Emp_Interface_Ui.result_set_scrollable.refreshRow();
			prev_Action();
			check_ResultSet_Status();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void add_Action()
	{
		try {
			Emp_Interface_Ui.result_set_scrollable.moveToInsertRow();
			Emp_Interface_Ui.result_set_scrollable.updateInt("empno",Integer.parseInt(Emp_Interface_Ui.empnofld.getText()));
			Emp_Interface_Ui.result_set_scrollable.updateString("ename",Emp_Interface_Ui.namefld.getText());
			Emp_Interface_Ui.result_set_scrollable.updateString("job", Emp_Interface_Ui.jobfld.getText());
			Emp_Interface_Ui.result_set_scrollable.updateDouble("sal", Double.parseDouble(Emp_Interface_Ui.salfld.getText()));
			Emp_Interface_Ui.result_set_scrollable.updateInt("deptno", Integer.parseInt(Emp_Interface_Ui.deptnochc.getSelectedItem()));
			Emp_Interface_Ui.result_set_scrollable.updateDate("hiredate",new Date(Emp_Interface_Ui.hiredatefld.getDate().getTime()));
			Emp_Interface_Ui.result_set_scrollable.insertRow();
			Emp_Interface_Ui.result_set_scrollable=Jdbc_Crud_Methods.getResulSet();
			Emp_Interface_Ui.addbtn.setEnabled(false);
			clear_Action();
			check_ResultSet_Status();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void save_Action()
	{
		try {
			Emp_Interface_Ui.result_set_scrollable.moveToCurrentRow();
			Emp_Interface_Ui.result_set_scrollable.updateString("ename",Emp_Interface_Ui.namefld.getText());
			Emp_Interface_Ui.result_set_scrollable.updateString("job", Emp_Interface_Ui.jobfld.getText());
			Emp_Interface_Ui.result_set_scrollable.updateDouble("sal", Double.parseDouble(Emp_Interface_Ui.salfld.getText()));
			Emp_Interface_Ui.result_set_scrollable.updateInt("deptno", Integer.parseInt(Emp_Interface_Ui.deptnochc.getSelectedItem()));
			Emp_Interface_Ui.result_set_scrollable.updateDate("hiredate",new Date(Emp_Interface_Ui.hiredatefld.getDate().getTime()));
			Emp_Interface_Ui.result_set_scrollable.updateRow();
			Emp_Interface_Ui.result_set_scrollable.refreshRow();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private static void setFeildsNonTouchable()
	{
		Emp_Interface_Ui.empnofld.setEnabled(false);
		Emp_Interface_Ui.namefld.setEnabled(false);
		Emp_Interface_Ui.jobfld.setEnabled(false);
		Emp_Interface_Ui.salfld.setEnabled(false);
		Emp_Interface_Ui.deptnochc.setEnabled(false);
		Emp_Interface_Ui.hiredatefld.setEnabled(false);
	}
	private static void check_ResultSet_Status() throws SQLException
	{
		if(Emp_Interface_Ui.result_set_scrollable.isFirst())
		{
			Emp_Interface_Ui.firstbtn.setEnabled(false);
			Emp_Interface_Ui.prevbtn.setEnabled(false);
		}
		else
		{
			Emp_Interface_Ui.firstbtn.setEnabled(true);
			Emp_Interface_Ui.prevbtn.setEnabled(true);
		}	
		if(Emp_Interface_Ui.result_set_scrollable.isLast())
		{
			Emp_Interface_Ui.lastbtn.setEnabled(false);
			Emp_Interface_Ui.nextbtn.setEnabled(false);
		}
		else
		{
			Emp_Interface_Ui.lastbtn.setEnabled(true);
			Emp_Interface_Ui.nextbtn.setEnabled(true);
		}
		if(Emp_Interface_Ui.result_set_scrollable.isBeforeFirst()||Emp_Interface_Ui.result_set_scrollable.isAfterLast())
		{
			Emp_Interface_Ui.editbtn.setEnabled(false);
			Emp_Interface_Ui.delbtn.setEnabled(false);
			Emp_Interface_Ui.savebtn.setEnabled(false);
		}
		else
		{
			Emp_Interface_Ui.editbtn.setEnabled(true);
			Emp_Interface_Ui.delbtn.setEnabled(true);
			Emp_Interface_Ui.savebtn.setEnabled(true);
		}
	}
	public static void set_Table_Data()
	{
		for(String column_heading:Emp_Interface_Ui.column)
			Emp_Interface_Ui.Table_Content.addColumn(column_heading);
		try {
			while(Emp_Interface_Ui.result_set_scrollable.next())
			{
				Emp_Interface_Ui.Table_Content.addRow(new String []{String.valueOf(Emp_Interface_Ui.result_set_scrollable.getInt("empno")),Emp_Interface_Ui.result_set_scrollable.getString("ename"),Emp_Interface_Ui.result_set_scrollable.getString("job"),String.valueOf(Emp_Interface_Ui.result_set_scrollable.getDouble("sal")),String.valueOf(Emp_Interface_Ui.result_set_scrollable.getInt("deptno")),String.valueOf(Emp_Interface_Ui.result_set_scrollable.getDate("hiredate"))});
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
