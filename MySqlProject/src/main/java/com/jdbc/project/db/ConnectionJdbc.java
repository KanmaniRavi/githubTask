package com.jdbc.project.db;

	import java.io.IOException;
import java.sql.Connection;
    import java.sql.DriverManager;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
     import java.util.List;

import com.jdbc.project.Member;

import java.util.ArrayList;
	public class ConnectionJdbc {
	private String dburl="jdbc:mysql://101.53.155.156:3306/mysql_demo_tnj";
	private String dbuname="mysql_demo_tnj";
	private String dbpassword= "Ebrain@20";
	private String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String  dbdriver) {
	try {
	    Class.forName(dbdriver);
	} catch (ClassNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	}
	public Connection getConnection() {
		Connection conn=null;
	      
	try {
	    conn=DriverManager.getConnection(dburl, dbuname, dbpassword);
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	    return conn;
	     
	}
	public String save(Member member) {
		// TODO Auto-generated method stub
	     loadDriver(dbdriver);
	     Connection conn=getConnection();
	     String result="value entered Successfully";
	     String sql="insert into tb_desapriyan_Jdbc(Name,Email,Phone) values (?,?,?)";
	     
	     try {
	        PreparedStatement ps=conn.prepareStatement(sql);
	        ps.setString(1,member.getName());
	        ps.setString(2,member.getEmail());        
	        ps.setString(3,member.getPhone());
	        ps.executeUpdate();
	        
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	        result="value not entered";
	    }
		return result ;
		
	}
	
	public String getAll(Member member) throws IOException {

	            loadDriver(dbdriver);
	   	     Connection conn=getConnection();
	            String sql="select * from tb_desapriyan_Jdbc where id=?";
	            String result ="datas";
	      
	          try {
	            PreparedStatement st = conn.prepareStatement(sql);
	  
	            st.setInt(1, Integer.valueOf(member.getName()));
	  
	            ResultSet rs = st.executeQuery();
	            List<Member> list = new ArrayList<Member>();
	            Member users =null;
	            
	            while (rs.next()) {
	           
	            	users = new Member();
	            	users.setName(rs.getString(1));
	            	users.setEmail(rs.getString(2));
	            	users.setPhone(rs.getString(3));
	  
	            }
	          
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return result;
			
	    }
	public String update(Member member) {

        loadDriver(dbdriver);
	     Connection conn=getConnection();
       
	     String result = "Updated table successfully";
        String sql="update tb_desapriyan_Jdbc set Name=?, Email=?, Phone=? where id=?";
		  try {
			  PreparedStatement ps=conn.prepareStatement(sql);
			    ps.setInt(1,member.getId() );
		        ps.setString(1,member.getName());
		        ps.setString(2,member.getEmail());        
		        ps.setString(3,member.getPhone());
		        ps.executeUpdate();
		        
		        ps.executeUpdate();
  
		        ps.close();
            conn.close();
  
    
        } catch (Exception e) {
            e.printStackTrace();
            result ="update get some error";
        }
		return result;
    }
	
	public String Delete(Member member) {
		 loadDriver(dbdriver);
	     Connection conn=getConnection();
	     String result = "Delete table successfully";
       String sql="delete from tb_desapriyan_Jdbc where id=?";
    try {     
        System.out.println("connection successful");
        PreparedStatement st = conn.prepareStatement(sql);

        st.setInt(1, Integer.valueOf(member.getEmail()));

        st.executeUpdate();

        st.close();
        conn.close();

      
    } catch (Exception e) {
        e.printStackTrace();
        result="msg=Delete";
	}
	return result;
  

	}
	}
	
