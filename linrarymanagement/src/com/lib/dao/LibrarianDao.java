package com.lib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.lib.model.Admin;

public class LibrarianDao {

	public static boolean verify(Admin a) {
		boolean i =false;
		try (Connection con = Dao.getcon();) {

			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM librarian");
			while(rs.next())
			{
				String name =( rs.getString("name")).trim();
				String pas = rs.getString("password").trim();
				if((name.equals(a.getUname())) &&( pas.equals(a.getPass())))
				{
					i=true;
				
				}
				}
						con.close();
			
			}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return i;
	
	}
	public static void deletee(String name)
	{
		String str="delete from books_deal where book_name = ?";
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
	public static int create(String name) {
		int i = 0;
		try (Connection con = Dao.getcon();) {
			PreparedStatement ps = con.prepareStatement("INSERT INTO books_deal (book_name) VALUES ( ?) ");
			ps.setString(1,name);
			
			i = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}
}
