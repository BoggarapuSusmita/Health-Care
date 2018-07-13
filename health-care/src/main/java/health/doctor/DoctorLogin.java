package health.doctor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DoctorLogin extends HttpServlet {
	String userid;
	String password;
	@RequestMapping(value="/dlogin")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		userid = request.getParameter("userid");
		password = request.getParameter("password");
		DoctorUsers u = new DoctorUsers();
		u.setUserid(userid);
		u.setPassword(password);
		int status = DoctorUsersDao.login(u);
		if(status > 0)
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("userid", userid);
			request.getRequestDispatcher("/WEB-INF/patient/doctorhome.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("invalid", "invalid userid or password");
			request.getRequestDispatcher("/WEB-INF/patient/doctorlogin.jsp").forward(request, response);
		}	
	}
	@RequestMapping(value="/editpro")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		DoctorUsers u = new DoctorUsers();
		u.setUserid(userid);
		DoctorUsers u1=DoctorUsersDao.getById(u);
		request.setAttribute("u1", u1);
		request.getRequestDispatcher("/WEB-INF/patient/editdoctor.jsp").forward(request, response);
	}
}
