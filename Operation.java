package miniprjct;
import java.awt.Color;
import java.awt.Font;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hariprasad
 */
public class Operation {
     static private Connection con;
    public static void DriverTest(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver tested!");
        }catch(java.lang.ClassNotFoundException e){
             System.out.println("Class not found exception");
            
            
        }
    }
    public static Connection getConnection(){
        return con;
    }
    public static Connection getConnection(String userid,String password){
        String hostname="127.0.0.1";//for college database
        String dbName="Project";
        String url="jdbc:mysql://"+hostname+":3306/"+dbName;
        con =null;
        try{
            con=(Connection) DriverManager.getConnection(url,userid,password);
        }
        catch(SQLException ex){
            con=null;
        }
        return(con);
    }
    public static void setConnection(Connection con1){
        con = con1;
    }
    public static int UPDATE_Table(String SQL) { 
        try{
            Statement stmt = con.createStatement();
            return (stmt.executeUpdate(SQL));
        }
    catch (SQLException e) { 
        System.out.println(e);
        return (-1);
} 
}
     public static ResultSet Query(String SQL) {
        try {
            Statement stmt = con.createStatement ();   
            return (stmt.executeQuery(SQL));
        } catch (SQLException e) {
            System.out.println(e);
            return (null);
        }
    }
       public static ResultSet Position(String SQL) {
        try {
            Statement stmt = con.createStatement (ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);   
           ResultSet rs=stmt.executeQuery(SQL);
           int i=1;
           while(rs.next()){
               rs.updateInt(1, i++);
               rs.updateRow();
           }
            return rs;
        } catch (SQLException e) {
            System.out.println(e);
            return (null);
        }
    }
     public static void ShowDataInTable(ResultSet rs,javax.swing.JTable jTable1,javax.swing.JFrame frame) throws CloneNotSupportedException {
        int count = 0;
        Vector<String> columnnames = new Vector<String>();
        Vector<String> row = new Vector<String>();
        try {
            ResultSetMetaData metaRS = rs.getMetaData();
            int columns = metaRS.getColumnCount();
            for (int i = 1; i <= columns; i++) {
                columnnames.add(metaRS.getColumnName(i)); //retrieve all column names
            }
           Vector<Vector<Object>> data=new Vector<Vector<Object>>();
      //  rs.first();
      // Vector<Object> data = new Vector<Object>();
       Vector<Object> rowData = new Vector<Object>();
      // Vector<Vector<Object>> rowData=new Vector<Vector<Object>>();
            while (rs.next()) {
                rowData.clear();
                ++count;
                for (int i = 1; i <= columns; i++) {
                    rowData.add(rs.getObject(i)); //to get all coulmns of the current rwo
                }
                data.add((Vector<Object>) rowData.clone());////populate data inot jtable
            }
            // System.out.println(data);
            // ((DefaultTableModel)jTable1.getModel()).addRow(new Object[]{data});
             DefaultTableModel tablemodel = new DefaultTableModel(data,columnnames);
            jTable1.setModel(tablemodel);
            JTableHeader THeader=jTable1.getTableHeader();
            THeader.setBackground(Color.red);
            THeader.setForeground(Color.black);
            THeader.setFont(new Font("Times New Roman", Font.BOLD,26));
            THeader.resizeAndRepaint();
             if (count == 0) {
                JOptionPane.showMessageDialog(frame, "No record found", "Record search ", 1);
            }
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Check your query!!!!"+ex, "Record search", 1);
       }
    }
     public static void CallableExecute(String SQL){
        try{
            CallableStatement stmt=con.prepareCall(SQL);
            stmt.executeUpdate();
        }
         catch (SQLException e) {
            System.out.println(e);
         }
     }
}