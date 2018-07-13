package health.doctor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoctorEdit {
	@RequestMapping(value="/dedit")
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
		HttpSession session=request.getSession(true);
		String userid=(String)session.getAttribute("userid");
		u.setUserid(userid);
		u.setUsername(username);
		u.setPassword(password);
		u.setAnswer(answer);
		u.setSecurityquestion(securityquestion);
		u.setContact_no(contact_no);
		u.setSpecification(specification);
		u.setDept(dept);
		u.setGender(gender);
		int status = DoctorUsersDao.edit(u);
		if(status > 0)
		{
			request.setAttribute("notreg", "Updated Succesfully");
			request.getRequestDispatcher("/WEB-INF/patient/doctorhome.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("notreg", "ERROR.......TRY AGAIN");
			request.getRequestDispatcher("/WEB-INF/patient/doctorhome.jsp").forward(request, response);
		}		
	}
}
