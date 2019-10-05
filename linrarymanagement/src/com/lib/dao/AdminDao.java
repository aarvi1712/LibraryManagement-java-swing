package com.lib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.lib.model.Admin;

public class AdminDao {
	public static int create(Admin a) {
		int i = 0;
		try (Connection con = Dao.getcon();) {
			PreparedStatement ps = con.prepareStatement("INSERT INTO admin_login (login_id, password) VALUES (?, ?) ");
			ps.setString(1, a.getUname());
			ps.setString(2, a.getPass());
			i = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}
	/*public static int view(DefaultTableModel model) {
		try (Connection con = Dao.getcon();) {
			PreparedStatement ps = con.prepareStatement(null);
			ResultSet rs = ps.executeQuery("SELECT * FROM admin_login");
			while (rs.next()) {
				
				int p=0;
				String id=rs.getString("login_id");
				String pas=rs.getString("password");	
					 
					model.insertRow(p, new Object[] { p,id,pas });
					p++;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
		
		return 0;
		
	}*/
	public static void deletee(String name)
	{
		String str="delete from admin_login where login_id = ?";
		try (Connection con = Dao.getcon();
				PreparedStatement ps = con.prepareStatement(str);)
		{
			ps.setString(1,name);
			ps.executeUpdate();
			
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}
