package health.patient;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PatientSetPassword {
	@RequestMapping(value="/preset")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PatientUsers u = new PatientUsers();
		HttpSession session = request.getSession(true);       
        String userid = (String)session.getAttribute("currentUser");
        u.setUserid(userid);
        u.setPassword(request.getParameter("password"));
        int status=PatientUsersDao.setPassword(u);
        if(status>0) {
        		request.setAttribute("status", "Updated Successfully");
			request.getRequestDispatcher("/WEB-INF/patient/passsuccess.jsp").forward(request, response);
        }
        else {
        		request.setAttribute("status", "Password Updation Failed......TRY AGAIN");
			request.getRequestDispatcher("/WEB-INF/patient/presetpass.jsp").forward(request, response);
        }
	}
}
