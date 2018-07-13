package health.patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import health.db.Provider;
public class PatientUsersDao {
	public static int login(PatientUsers u) 
	{
		int status= 0 ;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "select * from patient where userid=? and password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getUserid());
			pst.setString(2, u.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next())
				status = 1;
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
	public static int save(PatientUsers u) 
	{
		int status = 0 ;
		String userid=null;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "insert into  patient(username, password, securityquestion, answer, contact_no, gender, dob) values (?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getUsername());
			pst.setString(2, u.getPassword());
			pst.setString(3, u.getSecurityquestion());
			pst.setString(4, u.getAnswer());
			pst.setString(5,u.getContact_no());
			pst.setString(6, u.getGender());
			pst.setString(7, u.getAge());
			status = pst.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		if(status>0)
		{
			try 
			{
				Connection con = Provider.getConnection();	
				String sql = "select userid from patient where contact_no=? ";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, u.getContact_no());
				ResultSet rs = pst.executeQuery();
				if(rs.next())
					userid=rs.getString(1);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			return Integer.parseInt(userid);
		}
		else
			return status;
	}
	public static String getSecurityQuestion(PatientUsers u) 
	{
		String securityquestion=null;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "select securityquestion from patient where userid=? ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getUserid());
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				securityquestion=rs.getString(1);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return securityquestion;
	}
	public static int checkAnswer(PatientUsers u) 
	{
		int status=0;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "select * from patient where userid=? and answer=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getUserid());
			pst.setString(2, u.getAnswer());
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				status=1;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
	public static int setPassword(PatientUsers u) 
	{
		int status=0;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "update patient set password=? where userid=? ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getPassword());
			pst.setString(2, u.getUserid());
			status = pst.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
}
