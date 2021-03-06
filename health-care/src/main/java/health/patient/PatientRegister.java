package health.patient;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PatientRegister {
	@RequestMapping(value="/pregister")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		String userid = request.getParameter("userid");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String securityquestion = request.getParameter("securityquestion");
		String answer = request.getParameter("answer");
		String contact_no = request.getParameter("contact_no");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		
		PatientUsers u = new PatientUsers();
		u.setUserid(userid);
		u.setUsername(username);
		u.setPassword(password);
		u.setAnswer(answer);
		u.setSecurityquestion(securityquestion);
		u.setContact_no(contact_no);
		u.setAge(age);
		u.setGender(gender);
		
		int status = PatientUsersDao.save(u);
		if(status > 0)
		{
			request.setAttribute("uid", status);
			request.getRequestDispatcher("/WEB-INF/patient/psuccess.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("notreg", "NOT REGISTERED.......TRY AGAIN");
			request.getRequestDispatcher("/WEB-INF/patient/patientregister.jsp").forward(request, response);
		}
	}
}
