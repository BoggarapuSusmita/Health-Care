package health.patient;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PatientLogin extends HttpServlet {
	
	@RequestMapping(value="/plogin")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		PatientUsers u = new PatientUsers();
		u.setUserid(userid);
		u.setPassword(password);
		
		int status = PatientUsersDao.login(u);
		if(status > 0)
		{
			HttpSession session = request.getSession();
			session.setAttribute("userid", userid);
			request.getRequestDispatcher("/WEB-INF/patient/search.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("invalid", "invalid userid or password");
			request.getRequestDispatcher("/WEB-INF/patient/patientlogin.jsp").forward(request, response);
		}
	}
}
