package Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import com.microsoft.sqlserver.jdbc.*;

public class ProjectMain {
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	
	public ProjectMain() throws Exception
	{
		
		String url = "jdbc:sqlserver://localhost:1433; databaseName=restoran; integratedSecurity=true;"+
		"useUnicode=true&useJDBCCompliantTimezoneShift=true"+"&useLegacyDatetimeCode=false&serverTimezone=UTC \r\n";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con = DriverManager.getConnection(url);
		st = con.createStatement();

	}
	
	public ProjectMain(String url) throws Exception
	{
		con = DriverManager.getConnection(url);
		Statement st = con.createStatement();		
	}
	
public ResultSet ExecuteQuery(String sql) throws Exception
	{
		ResultSet rs = st.executeQuery(sql);
		return st.executeQuery(sql);
	}
	public int ExecuteUpdate(String sql) throws Exception
	{
		return st.executeUpdate(sql);
	}
	
	public TableModel ExecuteQueryTableModel(String sql) throws Exception
	{
		st = con.createStatement();
		return buildTableModel(st.executeQuery(sql));
	}

	public static DefaultTableModel buildTableModel(ResultSet rs)throws SQLException 
	{
	    ResultSetMetaData metaData = rs.getMetaData();

	    // names of columns
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = metaData.getColumnCount();
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // data of the table
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (rs.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(rs.getObject(columnIndex));
	        }
	        data.add(vector);
	    }

	    return new DefaultTableModel(data, columnNames);

	}

}