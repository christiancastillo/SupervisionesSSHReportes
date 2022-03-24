package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;

public interface IDatabaseUtils {	
	public void queryDB();
	public void insertDB();
	public void updateDB();
	public void retrieveDateIntoTable(String sql, JTable tabla);
	
}
