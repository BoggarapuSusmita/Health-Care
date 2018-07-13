package health.doctor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoctorRegister {
	@RequestMapping(value="/dregister")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String securityquestion = request.getParameter("securityquestion");
		String answer = request.getParameter("answer");
		String contact_no = request.getParameter("contact_no");
		String gender = request.getParameter("gender");
		String specification = request.getParameter("specification");
		String dept = request.getParameter("dept");
		
		DoctorUsers u = new DoctorUsers();
		u.setUsername(username);
		u.setPassword(password);
		u.setAnswer(answer);
		u.setSecurityquestion(securityquestion);
		u.setContact_no(contact_no);
		u.setSpecification(specification);
		u.setDept(dept);
		u.setGender(gender);
		int status = DoctorUsersDao.save(u);
		if(status > 0)
		{
			request.setAttribute("uid", status);
			request.getRequestDispatcher("/WEB-INF/patient/dsuccess.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("notreg", "ERROR.......TRY AGAIN");
			request.getRequestDispatcher("/WEB-INF/patient/doctorregister.jsp").forward(request, response);
		}		
	}
}
