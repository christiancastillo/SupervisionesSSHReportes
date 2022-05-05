package classes;

import javax.swing.JTable;

public interface IDatabaseUtils {	
	public void queryDB();
	public void insertDB();
	public void updateDB();
	public void retrieveDateIntoTable(String sql, JTable tabla);
	
}
