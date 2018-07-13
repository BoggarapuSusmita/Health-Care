package health.doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import health.db.Provider;
public class DoctorUsersDao {
	public static int login(DoctorUsers u) 
	{
		int status= 0 ;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "select * from doctor where userid=? and password=?";
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

	public static int save(DoctorUsers u) 
	{
		int status = 0 ;
		String userid=null;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "insert into  doctor(username, password, securityquestion, answer, dept, specification, contact_no, gender) values (?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getUsername());
			pst.setString(2, u.getPassword());
			pst.setString(3, u.getSecurityquestion());
			pst.setString(4, u.getAnswer());
			pst.setString(5, u.getDept());
			pst.setString(6, u.getSpecification());
			pst.setString(7, u.getContact_no());
			pst.setString(8, u.getGender());
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
				String sql = "select userid from doctor where contact_no=? ";
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
	public static String getSecurityQuestion(DoctorUsers u) 
	{
		String securityquestion=null;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "select securityquestion from doctor where userid=? ";
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
	public static String getPassword(DoctorUsers u) 
	{
		String password=null;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "select pasword from doctor where userid=? ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getUserid());
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				password=rs.getString(1);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return password;
	}
	public static DoctorUsers getById(DoctorUsers u)
	{
		DoctorUsers u1 = null;
		try 
		{
			String sql = "select * from doctor where userid=?";
			Connection con = Provider.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println(u.getUserid());
			pst.setString(1,u.getUserid());
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				u1 = new DoctorUsers();
				u1.setUsername(rs.getString("username"));
				u1.setContact_no(rs.getString("contact_no"));
				u1.setDept(rs.getString("dept"));
				u1.setGender(rs.getString("gender"));
				u1.setSpecification(rs.getString("specification"));
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return u1;
	}
	public static int edit(DoctorUsers u) 
	{
		int status = 0 ;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "update doctor set username=?, password=?, securityquestion=?, answer=?, dept=?, specification=?, contact_no=?, gender=? where userid=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getUsername());
			pst.setString(2, u.getPassword());
			pst.setString(3, u.getSecurityquestion());
			pst.setString(4, u.getAnswer());
			pst.setString(5, u.getDept());
			pst.setString(6, u.getSpecification());
			pst.setString(7, u.getContact_no());
			pst.setString(8, u.getGender());
			pst.setString(9, u.getUserid());
			status = pst.executeUpdate();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
	public static int checkAnswer(DoctorUsers u) 
	{
		int status=0;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "select * from doctor where userid=? and answer=?";
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
	public static int setPassword(DoctorUsers u) 
	{
		int status=0;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "update doctor set password=? where userid=? ";
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
