package health.patient;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PatientForgotPassword {
	@RequestMapping(value="/pforgot")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		String userid = request.getParameter("userid");
		PatientUsers u = new PatientUsers();
		u.setUserid(userid);
		HttpSession session = request.getSession(true);       
        session.setAttribute("currentUser",userid);
		String securityquestion = PatientUsersDao.getSecurityQuestion(u);
		if(securityquestion!=null) {
			request.setAttribute("securityquestion", securityquestion);
			request.getRequestDispatcher("/WEB-INF/patient/psecques.jsp").forward(request, response);
		}
		else{
			request.setAttribute("invalid", "invalid userid");
			request.getRequestDispatcher("/WEB-INF/patient/pfpass.jsp").forward(request, response);
		}
	}
	@RequestMapping(value="/psecques")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(true);       
        String userid = (String)session.getAttribute("currentUser");
        String answer = request.getParameter("answer");
		PatientUsers u = new PatientUsers();
		u.setUserid(userid);
		u.setAnswer(answer);
		int status = PatientUsersDao.checkAnswer(u);
		if(status>0)
			request.getRequestDispatcher("/WEB-INF/patient/presetpass.jsp").forward(request, response);
		else{
			request.setAttribute("incorrect", "incorrect answer");
			request.getRequestDispatcher("/WEB-INF/patient/psecques.jsp").forward(request, response);
		}	
	}
}
