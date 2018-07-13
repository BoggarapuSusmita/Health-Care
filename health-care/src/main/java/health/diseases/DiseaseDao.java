package health.diseases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import health.db.Provider;
import health.doctor.DoctorUsers;
public class DiseaseDao {
	public static ArrayList<String> check(DiseaseTable table) 
	{
		ArrayList<String> list=new ArrayList<>();
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "select distinct disease from care where symptom=? or symptom=? or symptom=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, table.getSymptom1());
			pst.setString(2, table.getSymptom2());
			pst.setString(3, table.getSymptom3());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				list.add(rs.getString("disease"));
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public static ArrayList<String> immprec(DiseaseTable table) 
	{
		ArrayList<String> list= new ArrayList<>();
		try 
		{
			Connection con = Provider.getConnection();
			String sql = "select distinct precaution from care where symptom=? or symptom=? or symptom=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, table.getSymptom1());
			pst.setString(2, table.getSymptom2());
			pst.setString(3, table.getSymptom3());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				list.add(rs.getString("precaution"));
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return list;
	}
	public static ArrayList<DoctorUsers> refdoc(){
		ArrayList<DoctorUsers> list = new ArrayList<DoctorUsers>();
		try 
		{
			String sql = "select username, dept, specification, contact_no from doctor";
			Connection con = Provider.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				DoctorUsers u= new DoctorUsers();
				u.setUsername(rs.getString("username"));
				u.setDept(rs.getString("dept"));
				u.setSpecification(rs.getString("specification"));
				u.setContact_no(rs.getString("contact_no"));
				list.add(u);
			}		
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return list;
	}
	public static int add(DiseaseTable u) {
		int status=0;
		try 
		{
			Connection con = Provider.getConnection();	
			String sql = "insert into  care(symptom, disease, precaution) values (?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, u.getSymptom1());
			pst.setString(2, u.getDisease());
			pst.setString(3, u.getPrecautions());
			status = pst.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
}
